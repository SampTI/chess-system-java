
package chess;

import java.util.List;
import java.util.stream.Collector;


public enum Color {
    BLACK,WHITE;

    Color collect(Collector<Object, ?, List<Object>> toList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
