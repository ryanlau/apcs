// JIMIN: Ryan Lau, Melody Lew, Paul Serbanescu
// APCS pd06
// L09: Some Folks Call It A Charades
// 2022-04-27
// time spent: 5 hours


import java.util.ArrayList;

/**
 * The framework for the Celebrity Game project
 *
 * @author cody.henrichsen
 * @version 2.3 25/09/2018 refactored the prepareGame and play methods
 */
public class CelebrityGame
{
	/**
	 * A reference to a Celebrity or subclass instance.
	 */
	 private Celebrity _gameCelebrity;
	/**
	 * The GUI frame for the Celebrity game.
	 */
	 private CelebrityFrame _gameWindow;
	/**
	 * The ArrayList of Celebrity values that make up the game
	 */
	 private ArrayList<Celebrity> _celebGameList;
	/**
	 * Builds the game and starts the GUI
	 */
	public CelebrityGame()
	{
		_celebGameList = new ArrayList<Celebrity>();
		_gameWindow = new CelebrityFrame(this);
        prepareGame();
	}

	/**
	 * Prepares the game to start by re-initializing the celebGameList and having the gameFrame open the start screen.
	 */
	public void prepareGame()
	{
		_celebGameList = new ArrayList<Celebrity>();
		_gameWindow.replaceScreen("START");
	}

	/**
	 * Determines if the supplied guess is correct.
	 *
	 * @param guess
	 *            The supplied String
	 * @return Whether it matches regardless of case or extraneous external
	 *         spaces.
	 */
	public boolean processGuess(String guess)
	{
		if (_gameCelebrity.getAnswer().strip().equalsIgnoreCase(guess.strip())) {
            _celebGameList.remove(_gameCelebrity);
            return true;
        }

        return false;
	}

	/**
	 * Asserts that the list is initialized and contains at least one Celebrity.
	 * Sets the current celebrity as the first item in the list. Opens the game
	 * play screen.
	 */
    public void play()
    {
        if (_celebGameList != null && _celebGameList.size() > 0) {
            this._gameCelebrity = _celebGameList.get(0);
            _gameWindow.replaceScreen("GAME");
        }
    }

    public void replay() {
        _gameWindow.replaceScreen("START");
    }

	/**
	 * Adds a Celebrity of specified type to the game list
	 *
	 * @param name
	 *            The name of the celebrity
	 * @param guess
	 *            The clue(s) for the celebrity
	 * @param type
	 *            What type of celebrity
	 */
	public void addCelebrity(String name, String guess, String type)
	{
        Celebrity c = new Celebrity(name, guess);
        _celebGameList.add(c);
	}

	/**
	 * Validates the name of the celebrity. It must have at least 4 characters.
	 * @param name The name of the Celebrity
	 * @return If the supplied Celebrity is valid
	 */
	public boolean validateCelebrity(String name)
	{
		return (name.length() >= 4);
	}

	/**
	 * Checks that the supplied clue has at least 10 characters or is a series of clues
	 * This method would be expanded based on your subclass of Celebrity.
	 * @param clue The text of the clue(s)
	 * @param type Supports a subclass of Celebrity
	 * @return If the clue is valid.
	 */
	public boolean validateClue(String clue, String type)
	{
		return clue.length() >= 10;
	}

	/**
	 * Accessor method for the current size of the list of celebrities
	 *
	 * @return Remaining number of celebrities
	 */
	public int getCelebrityGameSize()
	{
		return _celebGameList.size();
	}

	/**
	 * Accessor method for the games clue to maintain low coupling between
	 * classes
	 *
	 * @return The String clue from the current celebrity.
	 */
	public String sendClue()
	{
		return _gameCelebrity.getClue();
	}

	/**
	 * Accessor method for the games answer to maintain low coupling between
	 * classes
	 *
	 * @return The String answer from the current celebrity.
	 */
	public String sendAnswer()
	{
		return _gameCelebrity.getAnswer();
	}
}
