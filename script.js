document.addEventListener('DOMContentLoaded', () => {
    const searchForm = document.getElementById('search-form');
    const searchInput = document.getElementById('search-input');
    const movieList = document.getElementById('movie-list');
    const movieDetails = document.getElementById('movie-details');
    const backButton = document.getElementById('back-button');

    const apiKey = '739f58ba';  // Your OMDB API key

    searchForm.addEventListener('submit', searchMovies);
    backButton.addEventListener('click', backToSearch);

    function searchMovies(e) {
        e.preventDefault();
        const query = searchInput.value.trim();
        if (query) {
            fetch(`https://www.omdbapi.com/?s=${query}&apikey=${apiKey}`)
                .then(response => response.json())
                .then(data => {
                    if (data.Response === 'True') {
                        displayMovies(data.Search);
                    } else {
                        alert('No movies found! Please try another search.');
                        console.error('Error: ', data.Error);
                        movieList.innerHTML = '';  // Clear the movie list
                    }
                })
                .catch(error => {
                    console.error('Fetch Error:', error);
                    alert('An error occurred while fetching data. Please try again later.');
                });
        }
    }

    function displayMovies(movies) {
        movieList.innerHTML = '';
        movies.forEach(movie => {
            const div = document.createElement('div');
            div.classList.add('movie');
            div.innerHTML = `
                <img src="${movie.Poster !== 'N/A' ? movie.Poster : 'placeholder.png'}" alt="${movie.Title}">
                <h3>${movie.Title}</h3>
                <p>${movie.Year}</p>
            `;
            div.addEventListener('click', () => showMovieDetails(movie.imdbID));
            movieList.appendChild(div);
        });
    }

    function showMovieDetails(imdbID) {
        fetch(`https://www.omdbapi.com/?i=${imdbID}&apikey=${apiKey}`)
            .then(response => response.json())
            .then(movie => {
                movieDetails.innerHTML = `
                    <h2>${movie.Title}</h2>
                    <img src="${movie.Poster !== 'N/A' ? movie.Poster : 'placeholder.png'}" alt="${movie.Title}">
                    <p><strong>Year:</strong> ${movie.Year}</p>
                    <p><strong>Genre:</strong> ${movie.Genre}</p>
                    <p><strong>Director:</strong> ${movie.Director}</p>
                    <p><strong>Plot:</strong> ${movie.Plot}</p>
                    <button id="back-button">Back to Search</button>
                `;
                movieDetails.style.display = 'block';
                movieList.style.display = 'none';  // Hide movie list
                searchForm.style.display = 'none';  // Hide search form
                const backButton = document.getElementById('back-button');
                backButton.addEventListener('click', backToSearch);
            })
            .catch(error => {
                console.error('Fetch Error:', error);
                alert('An error occurred while fetching movie details. Please try again later.');
            });
    }

    function backToSearch() {
        movieDetails.style.display = 'none';  // Hide movie details
        movieList.style.display = 'flex';  // Show movie list
        searchForm.style.display = 'block';  // Show search form
    }
});
