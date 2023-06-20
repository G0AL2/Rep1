package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuHostHelper.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<k> f2678a = new CopyOnWriteArrayList<>();

    public i(Runnable runnable) {
        new HashMap();
    }

    public void a(Menu menu, MenuInflater menuInflater) {
        Iterator<k> it = this.f2678a.iterator();
        while (it.hasNext()) {
            it.next().b(menu, menuInflater);
        }
    }

    public boolean b(MenuItem menuItem) {
        Iterator<k> it = this.f2678a.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }
}
