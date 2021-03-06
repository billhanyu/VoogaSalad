package authoring.view.menu;

import javafx.scene.control.Menu;

/**
 * GameMenu is simply a container for GameMenuElements. Placed in top level of GameMenuView. Initialized through the
 * GameMenuFactory class.
 *
 * @author Will Long
 * @version 11/17/16
 */
public class GameMenu {

    private Menu myMenu;

    private GameMenu(String menuName) {
        myMenu = new Menu(menuName);
    }

    public void addGameMenuElement(AbstractGameMenuElement menuElement) {
        myMenu.getItems().add(menuElement.getMenuElement());
    }

    public Menu getMenu() {
        return myMenu;
    }
}
