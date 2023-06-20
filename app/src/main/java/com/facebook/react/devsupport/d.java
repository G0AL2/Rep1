package com.facebook.react.devsupport;

import android.os.Handler;
import android.view.View;
import android.widget.EditText;

/* compiled from: DoubleTapReloadRecognizer.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f15367a = false;

    /* compiled from: DoubleTapReloadRecognizer.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f15367a = false;
        }
    }

    public boolean b(int i10, View view) {
        if (i10 == 46 && !(view instanceof EditText)) {
            if (this.f15367a) {
                this.f15367a = false;
                return true;
            }
            this.f15367a = true;
            new Handler().postDelayed(new a(), 200L);
        }
        return false;
    }
}
