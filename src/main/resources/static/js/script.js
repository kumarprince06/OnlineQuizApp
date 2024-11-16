// Function to get the current theme from local storage or default to 'light'
const getTheme = () => {
    return localStorage.getItem("theme") || "light";
  };
  
  // Function to set the theme in local storage
  const setTheme = (theme) => {
    localStorage.setItem("theme", theme);
  };
  
  // Function to apply the theme to the HTML element and toggle icons
  const applyTheme = (theme) => {
    const htmlElement = document.querySelector("html");
  
    // Apply or remove the 'dark' class from the HTML element
    if (theme === "dark") {
      htmlElement.classList.add("dark");
    } else {
      htmlElement.classList.remove("dark");
    }
  
    // Sync the checkbox with the current theme
    const themeSwitch = document.querySelector("#theme_change_button");
    themeSwitch.checked = theme === "dark";
  
    // Toggle visibility of icons based on the current theme
    const lightIcon = document.querySelector("#light-icon"); // Sun icon (for switching to light mode)
    const darkIcon = document.querySelector("#dark-icon");  // Moon icon (for switching to dark mode)
  
    if (theme === "dark") {
      // Show sun icon when in dark mode
      lightIcon.classList.remove("hidden");
      darkIcon.classList.add("hidden");
    } else {
      // Show moon icon when in light mode
      lightIcon.classList.add("hidden");
      darkIcon.classList.remove("hidden");
    }
  };
  
  // Toggle the theme when the switch is toggled
  const changeTheme = () => {
    const currentTheme = getTheme();
    const newTheme = currentTheme === "light" ? "dark" : "light";
    applyTheme(newTheme);
    setTheme(newTheme);
  };
  
  // Initialize the theme based on stored value
  const initTheme = () => {
    const currentTheme = getTheme();
    applyTheme(currentTheme);
  
    // Add event listener for the checkbox
    const themeSwitch = document.querySelector("#theme_change_button");
    themeSwitch.addEventListener("change", changeTheme);
  };
  
  // Wait for the DOM content to be fully loaded before initializing the theme
  document.addEventListener("DOMContentLoaded", () => {
    initTheme();
  });
  