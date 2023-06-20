package l0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import l0.b;

/* compiled from: CursorAdapter.java */
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f33635a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f33636b;

    /* renamed from: c  reason: collision with root package name */
    protected Cursor f33637c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f33638d;

    /* renamed from: e  reason: collision with root package name */
    protected int f33639e;

    /* renamed from: f  reason: collision with root package name */
    protected C0438a f33640f;

    /* renamed from: g  reason: collision with root package name */
    protected DataSetObserver f33641g;

    /* renamed from: h  reason: collision with root package name */
    protected l0.b f33642h;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CursorAdapter.java */
    /* renamed from: l0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0438a extends ContentObserver {
        C0438a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CursorAdapter.java */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f33635a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f33635a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j10 = j(cursor);
        if (j10 != null) {
            j10.close();
        }
    }

    public abstract CharSequence b(Cursor cursor);

    @Override // l0.b.a
    public Cursor d() {
        return this.f33637c;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f33636b = true;
        } else {
            this.f33636b = false;
        }
        boolean z10 = cursor != null;
        this.f33637c = cursor;
        this.f33635a = z10;
        this.f33638d = context;
        this.f33639e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f33640f = new C0438a();
            this.f33641g = new b();
        } else {
            this.f33640f = null;
            this.f33641g = null;
        }
        if (z10) {
            C0438a c0438a = this.f33640f;
            if (c0438a != null) {
                cursor.registerContentObserver(c0438a);
            }
            DataSetObserver dataSetObserver = this.f33641g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f33635a || (cursor = this.f33637c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f33635a) {
            this.f33637c.moveToPosition(i10);
            if (view == null) {
                view = g(this.f33638d, this.f33637c, viewGroup);
            }
            e(view, this.f33638d, this.f33637c);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f33642h == null) {
            this.f33642h = new l0.b(this);
        }
        return this.f33642h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f33635a || (cursor = this.f33637c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f33637c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f33635a && (cursor = this.f33637c) != null && cursor.moveToPosition(i10)) {
            return this.f33637c.getLong(this.f33639e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f33635a) {
            if (this.f33637c.moveToPosition(i10)) {
                if (view == null) {
                    view = h(this.f33638d, this.f33637c, viewGroup);
                }
                e(view, this.f33638d, this.f33637c);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i10);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void i() {
        Cursor cursor;
        if (!this.f33636b || (cursor = this.f33637c) == null || cursor.isClosed()) {
            return;
        }
        this.f33635a = this.f33637c.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f33637c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0438a c0438a = this.f33640f;
            if (c0438a != null) {
                cursor2.unregisterContentObserver(c0438a);
            }
            DataSetObserver dataSetObserver = this.f33641g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f33637c = cursor;
        if (cursor != null) {
            C0438a c0438a2 = this.f33640f;
            if (c0438a2 != null) {
                cursor.registerContentObserver(c0438a2);
            }
            DataSetObserver dataSetObserver2 = this.f33641g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f33639e = cursor.getColumnIndexOrThrow("_id");
            this.f33635a = true;
            notifyDataSetChanged();
        } else {
            this.f33639e = -1;
            this.f33635a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
