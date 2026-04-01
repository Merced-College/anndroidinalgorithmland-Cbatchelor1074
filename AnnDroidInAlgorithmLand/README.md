[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=23174031)
# AnnDroidInAlgotihmLand
a sample project to practice sorting and searching

🎵 Download Required Audio File

This project uses an audio file that is too large to store directly in the GitHub repository.
Please download the file from Google Drive before running the program.

Download the audio file here:

➡️ Download the required audio file from Google Drive

Instructions

Open the Google Drive folder using the link above.

Download the ZIP file that contains the audio file.

Extract (unzip) the file on your computer.

Place the extracted audio file into the project folder named content.

Download all of the whole content folder, and put this in your project.

# Chase Batchelor, Xandra Leal, Matthew Briones
# March 31, 2026
# CPSC-39-12106

# This will project will a mini-game!

## Code Exploration

1. src contains all of the program's java files that are required to run the game.
2. The content folder contains many of the images, sounds, and data related files.
3. The uml file is to show a visual representation of how the project works.
4. The projects separate code from contents because it organizes it, and looks cleaner as well as removing the potential mistakes that could be made regarding file titles.

1. The class name of the file containing the main program is Main.
2. When the program begins it loads up a starting page of the game.
3. Some of the objects and classes that seem to be created at the start are the background for a title page, and positioning for other elements, to contribute to the design.

1. It seems that MainMenuPanel.java is responsible for drawing graphics, since it loads and displays images.
2. Loading files and content is handled by Assets.java.
3. The game updates by changing the panels and elements shown.

1. The UML diagram helps me understand the basic overview of how the main program influences other files, and how they will be referenced, and used.
2. The central class seems to be AppRouter because it ocnnects the main screens of the program and controls navigation.
3. Most of the classes depend on Main.java to be called, as well as Assets.java to ensure that the elements are found and referenced correctly.

1. Scores are stored within the ScoreEntry.java.
2. The scores are saved as integers.
3. It would make sense to implement the sorting of scores within LeaderboardAlgorithms.java since sorting is an algorithm.

Project setup completed successfully.