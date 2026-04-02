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

Project setup completed successfully.

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

## Sorting

1. We added the sorting code in the LeaderboardAlgorithms class because this class is responsible for handling algorithms related to the leaderboard.

2. We chose this location because it keeps all algorithmic logic in one place and maintains organization.

3. The data structure being sorted is an ArrayList of ScoreEntry objects.

4. We used the selection sort algorithm.

5. The algorithm works by looping through the list, finding the highest score, and placing it at the current position. It repeats until all elements are sorted in descending order.

6. We verified the sorting was correct by running the program, loading the data, and clicking the sort button to ensure that the information was correct.

## Searching

1. Binary search works by checking the middle element of a sorted list and comparing. Depending on where the target is found, the half is searched. This repeats until the target is foundm or the search is empty.

2. Data must be sorted because binary search decides whether to must left or right based on the comparison to the middle value. If data is not sorted, that would be an unreliable decision.

3. The variables used were low, high, and mid.

4. If the username is not found, -1 is returned, and the program displays a message showing that the user was not found.

Extra Credit: We also implemented a quicksort algorithm as extra credit. Quicksort works by selecting a pivot value, and paritioning into lists greater than and less than the pivot, and recursively sorting.