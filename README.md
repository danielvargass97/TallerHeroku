# TallerHeroku

Program that calculates the mean and standard deviation of a set of N real numbers entered through a web page.

## Requirements

Tools required to run the program

#### Java

It is a necessary platform for Maven to run, from the command line we check that it is installed through the command:

![image](https://user-images.githubusercontent.com/50029247/107102176-a6e40600-67e7-11eb-8d10-780d59081bd4.png)

#### Maven

The structure is standardized with Maven, from the command line we check that it is installed:

![image](https://user-images.githubusercontent.com/50029247/107102289-06daac80-67e8-11eb-84cc-033d988321ac.png)


#### Git

The Git version control system will be used, from the command line we check that it is installed:

![image](https://user-images.githubusercontent.com/50029247/107102338-2eca1000-67e8-11eb-8743-0d0ae69bb1ac.png)

#### Heroku

The website is hosted in the cloud using Heroku, to verify that the requirements are met locally:

![image](https://user-images.githubusercontent.com/50029247/107102505-a5670d80-67e8-11eb-8092-3b45a084d9f5.png)

## Installation

To download the repository locally, use the command:

![image](https://user-images.githubusercontent.com/50029247/107102690-435ad800-67e9-11eb-8397-2fe8576a4273.png)

To compile the project using Maven:

![image](https://user-images.githubusercontent.com/50029247/107102739-5ff71000-67e9-11eb-9362-748893a253ad.png)


## Running the Program

To run the program locally using Heroku, you need from the command line:

![image](https://user-images.githubusercontent.com/50029247/107102947-f3304580-67e9-11eb-9d1e-7200b083e027.png)

On the web page the numbers must be entered in the input field separated by commas.

### Generar JavaDoc


## Heroku


# Design

![Diseño](https://user-images.githubusercontent.com/50029247/107302290-27ef0780-6a4b-11eb-9865-4963d5acb25e.png)%

# Explanatio to the design

The design has 5 main classes divided into 2 packages. In the package LinkedList (linked list) in which are the Node classes (node) that is responsible for the creation of nodes and their links for the linked list; The LinkedList class (linked list) which creates our list, implements the list methods in JAVA in addition to the data extraction, storage and deletion methods used for the respective calculations. The Calculator class (calculator) in which are the Mean (mean) and StandardDeviation (standard deviation) classes. Which are in charge of making their respective calculation using the linked list designed by the student. The facade package, where is the SparkWebApp class where we create our view for the user, interact with it and attend to their needs.

# Autores

Daniel Vargas Ordoñez.

# Licencia

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
