package com.atenea.viewmodeltwo.Persistencia;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class MyViewModel extends androidx.lifecycle.ViewModel{
    private MutableLiveData<Integer> result;

    public MyViewModel()
    {
        result = new MutableLiveData<>();
    }
    public LiveData<Integer> getResultado(){
        return result;
    }
    public void aumentar(int data)
    {
        result.setValue(Model.aumentar(data));
    }
}






















