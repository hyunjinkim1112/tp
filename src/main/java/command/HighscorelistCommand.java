package command;

import modes.TypingTimer;
import storage.AutoAdjust;
import storage.Milestones;
import storage.State;
import typing.TypingAccuracy;
import typing.TypingTargetList;
import ui.Ui;

import java.io.IOException;
import java.util.Scanner;

public class HighscorelistCommand extends Command {

    @Override
    public void execute(Ui ui, Scanner sc, Milestones milestones, TypingTimer typingTimer, TypingAccuracy typingAccuracy,
                        TypingTargetList typingTargetList, State state, AutoAdjust autoAdjust) throws IOException {
        ui.showHighScoreList();
    }
}
