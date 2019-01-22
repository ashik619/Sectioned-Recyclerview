package io.github.ashik619.shadowfaxdemo;

/**
 * Created by dilip on 22/1/19.
 */

public interface MainPresenter {
    void onViewAttached();
    void onViewDetached();
    void onSearch(String text);
    void clearSerach();
}
