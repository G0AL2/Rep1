package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: Loader.java */
/* loaded from: classes.dex */
public class c<D> {
    Context mContext;
    int mId;
    InterfaceC0065c<D> mListener;
    b<D> mOnLoadCanceledListener;
    boolean mStarted = false;
    boolean mAbandoned = false;
    boolean mReset = true;
    boolean mContentChanged = false;
    boolean mProcessingChange = false;

    /* compiled from: Loader.java */
    /* loaded from: classes.dex */
    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            c.this.onContentChanged();
        }
    }

    /* compiled from: Loader.java */
    /* loaded from: classes.dex */
    public interface b<D> {
        void a(c<D> cVar);
    }

    /* compiled from: Loader.java */
    /* renamed from: androidx.loader.content.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0065c<D> {
        void a(c<D> cVar, D d10);
    }

    public c(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    public String dataToString(D d10) {
        StringBuilder sb2 = new StringBuilder(64);
        h0.b.a(d10, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    public void deliverCancellation() {
        b<D> bVar = this.mOnLoadCanceledListener;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void deliverResult(D d10) {
        InterfaceC0065c<D> interfaceC0065c = this.mListener;
        if (interfaceC0065c != null) {
            interfaceC0065c.a(this, d10);
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }

    public void forceLoad() {
        onForceLoad();
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    protected void onAbandon() {
    }

    protected boolean onCancelLoad() {
        throw null;
    }

    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onForceLoad() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onReset() {
    }

    protected void onStartLoading() {
        throw null;
    }

    protected void onStopLoading() {
    }

    public void registerListener(int i10, InterfaceC0065c<D> interfaceC0065c) {
        if (this.mListener == null) {
            this.mListener = interfaceC0065c;
            this.mId = i10;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void registerOnLoadCanceledListener(b<D> bVar) {
        if (this.mOnLoadCanceledListener == null) {
            this.mOnLoadCanceledListener = bVar;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z10 = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z10;
        return z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        h0.b.a(this, sb2);
        sb2.append(" id=");
        sb2.append(this.mId);
        sb2.append("}");
        return sb2.toString();
    }

    public void unregisterListener(InterfaceC0065c<D> interfaceC0065c) {
        InterfaceC0065c<D> interfaceC0065c2 = this.mListener;
        if (interfaceC0065c2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0065c2 == interfaceC0065c) {
            this.mListener = null;
            return;
        }
        throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }

    public void unregisterOnLoadCanceledListener(b<D> bVar) {
        b<D> bVar2 = this.mOnLoadCanceledListener;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 == bVar) {
            this.mOnLoadCanceledListener = null;
            return;
        }
        throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
}
