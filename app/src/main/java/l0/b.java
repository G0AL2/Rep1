package l0;

import android.database.Cursor;
import android.widget.Filter;

/* compiled from: CursorFilter.java */
/* loaded from: classes.dex */
class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    a f33645a;

    /* compiled from: CursorFilter.java */
    /* loaded from: classes.dex */
    interface a {
        void a(Cursor cursor);

        CharSequence b(Cursor cursor);

        Cursor c(CharSequence charSequence);

        Cursor d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar) {
        this.f33645a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f33645a.b((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor c10 = this.f33645a.c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (c10 != null) {
            filterResults.count = c10.getCount();
            filterResults.values = c10;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor d10 = this.f33645a.d();
        Object obj = filterResults.values;
        if (obj == null || obj == d10) {
            return;
        }
        this.f33645a.a((Cursor) obj);
    }
}
