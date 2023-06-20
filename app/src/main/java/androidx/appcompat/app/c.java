package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertDialog.java */
/* loaded from: classes.dex */
public class c extends h {

    /* renamed from: c  reason: collision with root package name */
    final AlertController f821c;

    /* compiled from: AlertDialog.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.f f822a;

        /* renamed from: b  reason: collision with root package name */
        private final int f823b;

        public a(Context context) {
            this(context, c.g(context, 0));
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f822a;
            fVar.f803w = listAdapter;
            fVar.f804x = onClickListener;
            return this;
        }

        public a b(boolean z10) {
            this.f822a.f798r = z10;
            return this;
        }

        public a c(View view) {
            this.f822a.f787g = view;
            return this;
        }

        public c create() {
            c cVar = new c(this.f822a.f781a, this.f823b);
            this.f822a.a(cVar.f821c);
            cVar.setCancelable(this.f822a.f798r);
            if (this.f822a.f798r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f822a.f799s);
            cVar.setOnDismissListener(this.f822a.f800t);
            DialogInterface.OnKeyListener onKeyListener = this.f822a.f801u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public a d(Drawable drawable) {
            this.f822a.f784d = drawable;
            return this;
        }

        public a e(DialogInterface.OnKeyListener onKeyListener) {
            this.f822a.f801u = onKeyListener;
            return this;
        }

        public a f(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f822a;
            fVar.f803w = listAdapter;
            fVar.f804x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public a g(int i10) {
            AlertController.f fVar = this.f822a;
            fVar.f786f = fVar.f781a.getText(i10);
            return this;
        }

        public Context getContext() {
            return this.f822a.f781a;
        }

        public a h(int i10) {
            AlertController.f fVar = this.f822a;
            fVar.f806z = null;
            fVar.f805y = i10;
            fVar.E = false;
            return this;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f822a;
            fVar.f792l = fVar.f781a.getText(i10);
            this.f822a.f794n = onClickListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f822a;
            fVar.f789i = fVar.f781a.getText(i10);
            this.f822a.f791k = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f822a.f786f = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.f fVar = this.f822a;
            fVar.f806z = view;
            fVar.f805y = 0;
            fVar.E = false;
            return this;
        }

        public a(Context context, int i10) {
            this.f822a = new AlertController.f(new ContextThemeWrapper(context, c.g(context, i10)));
            this.f823b = i10;
        }
    }

    protected c(Context context, int i10) {
        super(context, g(context, i10));
        this.f821c = new AlertController(getContext(), this, getWindow());
    }

    static int g(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(d.a.f28669o, typedValue, true);
        return typedValue.resourceId;
    }

    public Button e(int i10) {
        return this.f821c.c(i10);
    }

    public ListView f() {
        return this.f821c.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f821c.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f821c.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f821c.i(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f821c.r(charSequence);
    }
}
