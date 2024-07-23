package Manger;

import java.util.ArrayList;

public interface IManager <S> {
    void add(S s);
    void remove(int id);
    void update(int id,S s);
    int findIndexByID(int id);
    ArrayList<S> showAll();
}
