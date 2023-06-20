package h4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.FileDescriptor;

/* compiled from: WebpBitmapFactory.java */
/* loaded from: classes.dex */
public interface b {

    /* compiled from: WebpBitmapFactory.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    void a(h4.a aVar);

    void b(a aVar);

    Bitmap c(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options);
}
