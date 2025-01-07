
# Asteroid Collision Game

## Overview
This is a simple asteroid collision game implemented in Java using the Swing framework. The game features a player's spaceship that can move and shoot at asteroids.

## Key Architecture
1. **Inheritance-Based Design**: The game uses an inheritance-based design where all game objects inherit from a common `GameObject` class.
2. **Swing Graphics**: The game panel (`GamePanel`) is responsible for rendering game objects and managing the game loop.
3. **Event Handling**: Key inputs control the spaceship's movements and actions.

## Project Structure
```
asteroid-game/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── game/
│   │   │           ├── GameObject.java
│   │   │           ├── Asteroid.java
│   │   │           ├── Spaceship.java
│   │   │           ├── LargeAsteroid.java
│   │   │           ├── SmallAsteroid.java
│   │   │           ├── PlayerSpaceship.java
│   │   │           ├── GamePanel.java
│   │   │           ├── GameFrame.java
│   │   │           └── Main.java
├── pom.xml
└── README.md
```

## How to Run
1. **Build the Project**:
   ```bash
   mvn clean install
   ```

2. **Run the Game**:
   ```bash
   mvn exec:java -Dexec.mainClass=dk.sdu.cbs.game.Main
   ```

3. **Controls**:
   - Use the **Left Arrow** and **Right Arrow** keys to move the spaceship.
   - Press **Spacebar** to shoot.

## Features
- Real-time rendering and game loop (~60 FPS).
- Keyboard-controlled spaceship movement.
- Basic asteroid collision mechanics.

## Future Improvements
- Add collision detection between spaceship and asteroids.
- Implement score tracking and levels.
- Enhance graphics and add sound effects.
