package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.j;

/* compiled from: MenuDialogHelper.java */
/* loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: a  reason: collision with root package name */
    private e f1094a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.appcompat.app.c f1095b;

    /* renamed from: c  reason: collision with root package name */
    c f1096c;

    /* renamed from: d  reason: collision with root package name */
    private j.a f1097d;

    public f(e eVar) {
        this.f1094a = eVar;
    }

    public void a() {
        androidx.appcompat.app.c cVar = this.f1095b;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void b(e eVar, boolean z10) {
        if (z10 || eVar == this.f1094a) {
            a();
        }
        j.a aVar = this.f1097d;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean c(e eVar) {
        j.a aVar = this.f1097d;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f1094a;
        c.a aVar = new c.a(eVar.u());
        c cVar = new c(aVar.getContext(), d.g.f28766j);
        this.f1096c = cVar;
        cVar.d(this);
        this.f1094a.b(this.f1096c);
        aVar.a(this.f1096c.a(), this);
        View y10 = eVar.y();
        if (y10 != null) {
            aVar.c(y10);
        } else {
            aVar.d(eVar.w()).setTitle(eVar.x());
        }
        aVar.e(this);
        androidx.appcompat.app.c create = aVar.create();
        this.f1095b = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1095b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1095b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f1094a.L((g) this.f1096c.a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1096c.b(this.f1094a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1095b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1095b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1094a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1094a.performShortcut(i10, keyEvent, 0);
    }
}
