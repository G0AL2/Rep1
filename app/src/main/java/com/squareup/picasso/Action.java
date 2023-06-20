package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
abstract class Action<T> {
    boolean cancelled;
    final Drawable errorDrawable;
    final int errorResId;
    final String key;
    final int memoryPolicy;
    final int networkPolicy;
    final boolean noFade;
    final Picasso picasso;
    final Request request;
    final Object tag;
    final WeakReference<T> target;
    boolean willReplay;

    /* loaded from: classes3.dex */
    static class RequestWeakReference<M> extends WeakReference<M> {
        final Action action;

        RequestWeakReference(Action action, M m10, ReferenceQueue<? super M> referenceQueue) {
            super(m10, referenceQueue);
            this.action = action;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Action(Picasso picasso, T t10, Request request, int i10, int i11, int i12, Drawable drawable, String str, Object obj, boolean z10) {
        this.picasso = picasso;
        this.request = request;
        this.target = t10 == null ? null : new RequestWeakReference(this, t10, picasso.referenceQueue);
        this.memoryPolicy = i10;
        this.networkPolicy = i11;
        this.noFade = z10;
        this.errorResId = i12;
        this.errorDrawable = drawable;
        this.key = str;
        this.tag = obj == null ? this : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void cancel() {
        this.cancelled = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void error(Exception exc);

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getKey() {
        return this.key;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMemoryPolicy() {
        return this.memoryPolicy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getNetworkPolicy() {
        return this.networkPolicy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Picasso getPicasso() {
        return this.picasso;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Picasso.Priority getPriority() {
        return this.request.priority;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Request getRequest() {
        return this.request;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object getTag() {
        return this.tag;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public T getTarget() {
        WeakReference<T> weakReference = this.target;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isCancelled() {
        return this.cancelled;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean willReplay() {
        return this.willReplay;
    }
}