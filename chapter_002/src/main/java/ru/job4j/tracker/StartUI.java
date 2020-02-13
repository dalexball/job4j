package ru.job4j.tracker;

/**
 * Class that provides user with interface of program
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class StartUI {

    /**
     * Initializes menu and works with user
     *
     * @param input       - input
     * @param tracker     - tracker
     * @param userActions - user actions
     */
    public void init(Input input, Tracker tracker, UserAction[] userActions) {
        boolean run = true;
        while (run) {
            this.showMenu(userActions);
            int select = input.askInt("Select: ", userActions.length);
            run = userActions[select].execute(input, tracker);
        }
    }

    /**
     * Show menu that contains possible user actions
     *
     * @param userActions - user actions
     */
    private void showMenu(UserAction[] userActions) {
        System.out.println("Menu.");
        for (int index = 0; index < userActions.length; index++) {
            System.out.println(index + ". " + userActions[index].name());
        }
    }

    public static void main(String[] args) {
        Input console = new ConsoleInput();
        Input input = new ValidateInput(console);
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker, new UserAction[]{
                new CreateItem(), new ShowAll(), new EditItem(),
                new DeleteItem(), new FindItem(), new FindByName(), new ExitProgram()});
    }
}
