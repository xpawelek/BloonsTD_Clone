
# 🎈 BloonsTD_Recreation

A complete tower defense game written in **Java** with **JavaFX**, inspired by the classic **Bloons Tower Defense 1**. This project features dynamic tower logic, animated balloon waves, upgrade mechanics, and a fully interactive UI.




## 🎮 Gameplay Preview

> **https://www.youtube.com/watch?v=jvktlqv9lfw&feature=youtu.be**


---

## 🎯 Features

- Fully rendered balloon path with defined waypoints
  
- **Multiple tower types**:
  - Dart Tower
  - Ice Tower
  - Tack Tower
  - Superman Tower (recently added!)
    
- **Tower logic**:
  - Projectile tracking and collisions (darts)
  - Area-of-effect -> freezing (Ice Tower)
  - Upgradable towers with different effects
 
- **Gameplay elements**:
  - Balloon waves with increasing difficulty
  - Wave-based spawning and animation logic
  - Lives and money system
  - Game restart after loss
  - Information board with real-time feedback
    
- **Visual polish**:
  - JavaFX styling using CSS
  - Smooth animations and feedback effects
  - Custom font and assets


## Game Screenshots:

> **


## 🕹️ How to Play

1. Click one of the tower icons on the left panel (Dart, Ice, Tack, or Superman).
2. Move your mouse to place the tower on the map:
   - You can place a tower **only if**:
     - It’s not on the path,
     - It touches the path (is in range),
     - It doesn’t overlap another tower,
     - You have enough money.
     - If you can't place the tower, a message you will the message:  
     `"Not enough money, you need: X!"`
3. Click **Start Round** to send a wave of balloons.
4. Towers attack balloons automatically if they are in range.
5. Click on a tower to:
   - Upgrade it (if affordable),
   - Sell it for 90% of its cost.
6. If balloons reach the end of the path, you lose lives.
7. The game restarts automatically if all lives are lost.

## Technologies Used

- Java 17+
- JavaFX
- CSS for UI styling
- MVC Design Pattern

## Architecture

The project follows the **Model-View-Controller (MVC)** pattern:

- **Model**: Game logic — towers, balloons, animations, wave handling, upgrades
- **View**: FXML and JavaFX UI components, assets (images, fonts, CSS)
- **Controller**: Handles user input, game flow, and UI events

---

## Inspired By

This game is inspired by the classic Bloons Tower Defense 1 by **Ninja Kiwi** and it is only used for educational purposes.
