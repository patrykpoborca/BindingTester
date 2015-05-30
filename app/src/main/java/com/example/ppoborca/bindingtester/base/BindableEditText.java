package com.example.ppoborca.bindingtester.base;

import android.content.Context;
import android.databinding.BaseObservable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;

public class BindableEditText extends EditText {
    private int mField;
    private BaseObservable mObservable;

    public BindableEditText(Context context) {
        super(context);
    }

    public BindableEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BindableEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void addObserveable(String text, ShortTextWatcher textWatcher){
        setText(text);

        addTextChangedListener(textWatcher);
    }

    public static class ShortTextWatcher implements TextWatcher {
        @Override
        public void afterTextChanged(Editable editable) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }
    }
}
