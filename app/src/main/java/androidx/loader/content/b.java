package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.loader.content.c;
import e0.i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* compiled from: CursorLoader.java */
/* loaded from: classes.dex */
public class b extends a<Cursor> {

    /* renamed from: a  reason: collision with root package name */
    final c<Cursor>.a f3440a;

    /* renamed from: b  reason: collision with root package name */
    Uri f3441b;

    /* renamed from: c  reason: collision with root package name */
    String[] f3442c;

    /* renamed from: d  reason: collision with root package name */
    String f3443d;

    /* renamed from: e  reason: collision with root package name */
    String[] f3444e;

    /* renamed from: f  reason: collision with root package name */
    String f3445f;

    /* renamed from: g  reason: collision with root package name */
    Cursor f3446g;

    /* renamed from: h  reason: collision with root package name */
    e0.b f3447h;

    public b(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f3440a = new c.a();
        this.f3441b = uri;
        this.f3442c = strArr;
        this.f3443d = str;
        this.f3444e = strArr2;
        this.f3445f = str2;
    }

    @Override // androidx.loader.content.c
    /* renamed from: a */
    public void deliverResult(Cursor cursor) {
        if (isReset()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f3446g;
        this.f3446g = cursor;
        if (isStarted()) {
            super.deliverResult(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // androidx.loader.content.a
    /* renamed from: b */
    public Cursor loadInBackground() {
        synchronized (this) {
            if (!isLoadInBackgroundCanceled()) {
                this.f3447h = new e0.b();
            } else {
                throw new i();
            }
        }
        try {
            Cursor a10 = androidx.core.content.a.a(getContext().getContentResolver(), this.f3441b, this.f3442c, this.f3443d, this.f3444e, this.f3445f, this.f3447h);
            if (a10 != null) {
                try {
                    a10.getCount();
                    a10.registerContentObserver(this.f3440a);
                } catch (RuntimeException e10) {
                    a10.close();
                    throw e10;
                }
            }
            synchronized (this) {
                this.f3447h = null;
            }
            return a10;
        } catch (Throwable th) {
            synchronized (this) {
                this.f3447h = null;
                throw th;
            }
        }
    }

    @Override // androidx.loader.content.a
    /* renamed from: c */
    public void onCanceled(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // androidx.loader.content.a
    public void cancelLoadInBackground() {
        super.cancelLoadInBackground();
        synchronized (this) {
            e0.b bVar = this.f3447h;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    @Override // androidx.loader.content.a, androidx.loader.content.c
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f3441b);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f3442c));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f3443d);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f3444e));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f3445f);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f3446g);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.mContentChanged);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.loader.content.c
    public void onReset() {
        super.onReset();
        onStopLoading();
        Cursor cursor = this.f3446g;
        if (cursor != null && !cursor.isClosed()) {
            this.f3446g.close();
        }
        this.f3446g = null;
    }

    @Override // androidx.loader.content.c
    protected void onStartLoading() {
        Cursor cursor = this.f3446g;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.f3446g == null) {
            forceLoad();
        }
    }

    @Override // androidx.loader.content.c
    protected void onStopLoading() {
        cancelLoad();
    }
}
