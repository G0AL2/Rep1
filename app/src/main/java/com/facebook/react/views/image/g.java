package com.facebook.react.views.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: ReactImageDownloadListener.java */
/* loaded from: classes.dex */
public class g<INFO> extends u4.g implements r4.d<INFO> {

    /* compiled from: ReactImageDownloadListener.java */
    /* loaded from: classes.dex */
    private static final class b extends Drawable {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public g() {
        super(new b());
    }

    @Override // r4.d
    public void a(String str, INFO info) {
    }

    @Override // r4.d
    public void g(String str) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u4.g, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        w(i10, 10000);
        return super.onLevelChange(i10);
    }

    @Override // r4.d
    public void q(String str, Throwable th) {
    }

    public void w(int i10, int i11) {
        throw null;
    }
}
