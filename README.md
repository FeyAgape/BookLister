# BookLister
A Book Listing App

The goal is to design and create the structure of a Book Listing app which would allow a user to get a list of published books on a 
given topic. Used the google books api in order to fetch results and display them to the user.

This project is about combining various ideas and skills we’ve been practicing throughout the course. They include:

Fetching data from an API

Using an AsyncTask

Parsing a JSON response

Creating a list based on that data and displaying it to the user.

API Call: The user can enter a word or phrase to serve as a search query. The app fetches book data related to the query via an HTTP request from the Google Books API, using a class such as HttpUriRequest or HttpURLConnection.

Response Validation: The app checks whether the device is connected to the internet and responds appropriately. The result of the request is validated to account for a bad server response or lack of server response.

Async Task: The network call occurs off the UI thread using an AsyncTask or similar threading object.

JSON Parsing: The JSON response is parsed correctly, and relevant information is stored in the app.

ListView Population: The ListView is properly populated with the information parsed from the JSON response.

No Data Message: When there is no data to display, the app shows a default TextView that informs the user how to populate the list.
