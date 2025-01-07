
# Asteroid Collision Game (Component-Based Design)

## Overview
This project demonstrates a component-based design for an asteroid collision game using Java and Maven. The project is structured as a multi-module Maven project, with separate modules for components, entities, systems, and the game runner.

## Project Structure
```
asteroid-game/
├── pom.xml                 # Parent POM
├── game-commons/           # Common components
├── game-entities/          # Entity definitions
├── game-systems/           # Systems for processing components
└── game-runner/            # Main application and GUI
```

## How to Build and Run
1. Build the entire project:
   ```bash
   mvn clean install
   ```

2. Run the game:
   ```bash
   cd game-runner
   mvn exec:java -Dexec.mainClass=sdu.cbs.Main
   ```

## Modules
### 1. game-commons
Defines reusable components such as position, velocity, collision, and health.

### 2. game-entities
Defines game entities like `Asteroid` and `Spaceship`.

### 3. game-systems
Contains systems like `MovementSystem` and `CollisionSystem`.

### 4. game-runner
The main module that integrates everything and runs the game.
