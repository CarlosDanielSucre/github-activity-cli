
# GitHub Activity CLI

This project is a simple **command line interface (CLI)** tool that fetches the recent public activity of a GitHub user and displays it directly in the terminal.

It will help you practice:
- Making HTTP requests
- Parsing and handling JSON
- Working with public APIs (specifically, the [GitHub API](https://docs.github.com/en/rest))
- Building a simple CLI application
- Error handling

---

## 🧠 Features

- Accept a GitHub username as a CLI argument.
- Fetch the user's recent public activity using the GitHub API.
- Display the activity in a human-readable format in the terminal.
- Handle errors gracefully (e.g., invalid usernames, network failures).
- **No external libraries** should be used to fetch the data.

---

## 🚀 How to Run

From the command line, run the script with a GitHub username:

```bash
github-activity <username>
```

### Example

```bash
github-activity kamranahmedse
```

The CLI will output something like:

```
- Pushed 3 commits to kamranahmedse/developer-roadmap
- Opened a new issue in kamranahmedse/developer-roadmap
- Starred kamranahmedse/developer-roadmap
```

---

## 📡 GitHub API Endpoint

The application fetches the user’s activity using the following endpoint:

```
https://api.github.com/users/<username>/events
```

Replace `<username>` with the actual GitHub username.

### Example URL

```
https://api.github.com/users/kamranahmedse/events
```

---

## 💥 Error Handling

The application must handle cases such as:

- Username not found
- API request failure (e.g., rate limits, connectivity issues)
- Empty or malformed responses

---

## 🌱 Advanced Ideas (Optional)

If you want to take this project further:

- Allow filtering by event type (e.g., only `PushEvent` or `IssuesEvent`)
- Format the output in a more structured way (e.g., table, JSON)
- Cache the fetched data to reduce API calls
- Explore more GitHub endpoints to enrich the output with repository or user details

---

## 🔍 Resources

- GitHub REST API Documentation: [https://docs.github.com/en/rest](https://docs.github.com/en/rest)

---

## 🛠️ Found a mistake?

Feel free to contribute or suggest improvements!
