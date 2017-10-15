package network.warzone.tgm.modules.killstreak;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MatrixTunnel on 10/3/2017.
 */
@NoArgsConstructor @Getter
public class Killstreak {

    private int count = 0;
    private String message = "";
    private List<String> commands = new ArrayList<>();

    // Return 'this' for chaining
    public Killstreak setCount(int count) {
        this.count = count;
        return this;
    }

    public Killstreak setMessage(String message) {
        this.message = message;
        return this;
    }

    public Killstreak setCommands(List<String> commands) {
        this.commands = commands;
        return this;
    }

}
