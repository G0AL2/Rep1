package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;

/* compiled from: ReactEditTextInputConnectionWrapper.java */
/* loaded from: classes.dex */
class d extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    private c f16352a;

    /* renamed from: b  reason: collision with root package name */
    private com.facebook.react.uimanager.events.d f16353b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16354c;

    /* renamed from: d  reason: collision with root package name */
    private String f16355d;

    public d(InputConnection inputConnection, ReactContext reactContext, c cVar, com.facebook.react.uimanager.events.d dVar) {
        super(inputConnection, false);
        this.f16355d = null;
        this.f16353b = dVar;
        this.f16352a = cVar;
    }

    private void a(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        this.f16353b.g(new j(this.f16352a.getId(), str));
    }

    private void b(String str) {
        if (this.f16354c) {
            this.f16355d = str;
        } else {
            a(str);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f16354c = true;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.length() <= 2) {
            if (charSequence2.equals("")) {
                charSequence2 = "Backspace";
            }
            b(charSequence2);
        }
        return super.commitText(charSequence, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        a("Backspace");
        return super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        this.f16354c = false;
        String str = this.f16355d;
        if (str != null) {
            a(str);
            this.f16355d = null;
        }
        return super.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            boolean z10 = keyEvent.getUnicodeChar() < 58 && keyEvent.getUnicodeChar() > 47;
            if (keyEvent.getKeyCode() == 67) {
                a("Backspace");
            } else if (keyEvent.getKeyCode() == 66) {
                a("Enter");
            } else if (z10) {
                a(String.valueOf(keyEvent.getNumber()));
            }
        }
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        int selectionStart = this.f16352a.getSelectionStart();
        int selectionEnd = this.f16352a.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i10);
        int selectionStart2 = this.f16352a.getSelectionStart();
        boolean z10 = false;
        b((((selectionStart2 < selectionStart || selectionStart2 <= 0) ? true : true) || (!(selectionStart == selectionEnd) && (selectionStart2 == selectionStart))) ? "Backspace" : String.valueOf(this.f16352a.getText().charAt(selectionStart2 - 1)));
        return composingText;
    }
}
