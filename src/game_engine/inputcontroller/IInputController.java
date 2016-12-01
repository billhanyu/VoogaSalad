package game_engine.inputcontroller;

import java.util.List;
import java.util.Set;

import game_object.acting.KeyEvent;
/**
 * 
 * @author 
 *input controller for a character. Checks the inputs that are being pressed and determines what happens to objects because of this
 */
public interface IInputController {
	/**
	 * set the key inputs for the character
	 * @param list
	 */
	public abstract void setInputList(Set<KeyEvent> list);
	/**
	 * determines what the given input does to the object and executes
	 */
	public abstract void executeInput();

}
