# Project Guidelines

## Code Style
- Preserve Java package organization exactly as implemented in `src/` (`arma`, `personagem`, `transporte`, `fabrica`).
- Keep naming in Portuguese to match the existing codebase.
- Prefer interface-first design: code against `FabricaTema`, `Personagem`, `Arma`, and `Transporte` contracts.
- Keep `App` as the client/orchestrator and avoid moving concrete creation logic into it.

## Architecture
- This project demonstrates the Abstract Factory pattern.
- `fabrica/FabricaTema` defines the family creation contract:
  - `criarPersonagem()`
  - `criarArma()`
  - `criarTransporte()`
- Each concrete factory returns one consistent theme family:
  - Medieval: `Cavaleiro`, `Espada`, `Cavalo`
  - Futurista: `Androide`, `Laser`, `NaveEspacial`
  - Fantasia: `Mago`, `Cajado`, `TapeteVoador`
- When adding a new theme, add a full trio (personagem, arma, transporte) and a corresponding factory implementation.

## Build and Test
- There is no Maven/Gradle project; use plain `javac` and `java`.
- Build from workspace root:
  - `javac -encoding UTF-8 -d bin -sourcepath src "src/App.java"`
- Run from workspace root:
  - `java -cp bin App`
- No automated test suite is currently configured.

## Conventions
- Use quoted paths in commands because this workspace path contains spaces and non-ASCII characters.
- Keep `.vscode/settings.json` expectations in sync:
  - source path: `src`
  - output path: `bin`
  - libraries: `lib/**/*.jar`
- Preserve current interaction style in `App.java` (theme selection via map lookup and one execution flow).
