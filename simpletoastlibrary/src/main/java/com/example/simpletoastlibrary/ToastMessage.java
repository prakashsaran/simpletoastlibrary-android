package com.example.simpletoastlibrary;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class ToastMessage {
    public static void showToast(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
        Log.d("ToastMessage",message);
    }
}
