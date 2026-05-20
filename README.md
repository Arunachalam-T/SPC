# Conway's Game of Life – Java Simulation

## Overview
This project implements **Conway’s Game of Life** using Java. The simulation evolves a grid of cells over multiple generations based on predefined rules.

Each cell can be in one of two states:

- `1` → Alive
- `0` → Dead

The program accepts user input for:

- Number of rows
- Number of columns
- Initial grid values
- Number of generations

The grid is updated generation by generation and displayed after each iteration.

---

## Conway Rules

### Underpopulation
A live cell with fewer than 2 live neighbours dies.

### Survival
A live cell with 2 or 3 live neighbours survives.

### Overpopulation
A live cell with more than 3 live neighbours dies.

### Reproduction
A dead cell with exactly 3 live neighbours becomes alive.

---

## Features

✔ Dynamic grid size input  
✔ Multiple generation simulation  
✔ Separate Game of Life function  
✔ Neighbour checking using direction arrays  
✔ Grid display after every generation  

---

## Technologies Used

- Java
- VS Code
- Git
- GitHub

---

## Project Structure

```text
conway.java
README.md
