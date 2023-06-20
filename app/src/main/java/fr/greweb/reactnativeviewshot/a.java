package fr.greweb.reactnativeviewshot;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.n;
import com.facebook.react.uimanager.q0;
import com.google.android.gms.common.api.Api;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.zip.Deflater;

/* compiled from: ViewShot.java */
/* loaded from: classes3.dex */
public class a implements q0, LifecycleEventListener {

    /* renamed from: p  reason: collision with root package name */
    private static final String f30376p = "a";

    /* renamed from: q  reason: collision with root package name */
    private static byte[] f30377q = new byte[Constants.MIN_PROGRESS_STEP];

    /* renamed from: r  reason: collision with root package name */
    private static final Object f30378r = new Object();

    /* renamed from: s  reason: collision with root package name */
    private static final Set<Bitmap> f30379s = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a  reason: collision with root package name */
    private HandlerThread f30380a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f30381b;

    /* renamed from: c  reason: collision with root package name */
    private final int f30382c;

    /* renamed from: d  reason: collision with root package name */
    private final String f30383d;
    @d

    /* renamed from: e  reason: collision with root package name */
    private final int f30384e;

    /* renamed from: f  reason: collision with root package name */
    private final double f30385f;

    /* renamed from: g  reason: collision with root package name */
    private final Integer f30386g;

    /* renamed from: h  reason: collision with root package name */
    private final Integer f30387h;

    /* renamed from: i  reason: collision with root package name */
    private final File f30388i;

    /* renamed from: j  reason: collision with root package name */
    private final String f30389j;

    /* renamed from: k  reason: collision with root package name */
    private final Promise f30390k;

    /* renamed from: l  reason: collision with root package name */
    private final Boolean f30391l;

    /* renamed from: m  reason: collision with root package name */
    private final ReactApplicationContext f30392m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f30393n;

    /* renamed from: o  reason: collision with root package name */
    private final Activity f30394o;

    /* compiled from: ViewShot.java */
    /* renamed from: fr.greweb.reactnativeviewshot.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class RunnableC0388a implements Runnable {
        RunnableC0388a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.v();
        }
    }

    /* compiled from: ViewShot.java */
    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f30396a;

        b(n nVar) {
            this.f30396a = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            View findViewById = a.this.f30382c == -1 ? a.this.f30394o.getWindow().getDecorView().findViewById(16908290) : this.f30396a.w(a.this.f30382c);
            if (findViewById == null) {
                String str = a.f30376p;
                Log.e(str, "No view found with reactTag: " + a.this.f30382c, new AssertionError());
                Promise promise = a.this.f30390k;
                promise.reject("E_UNABLE_TO_SNAPSHOT", "No view found with reactTag: " + a.this.f30382c);
                return;
            }
            try {
                e eVar = new e(a.f30377q);
                eVar.h(a.z(findViewById));
                byte[] unused = a.f30377q = eVar.e();
                if (!"tmpfile".equals(a.this.f30389j) || -1 != a.this.f30384e) {
                    if (!"tmpfile".equals(a.this.f30389j) || -1 == a.this.f30384e) {
                        if (!"base64".equals(a.this.f30389j) && !"zip-base64".equals(a.this.f30389j)) {
                            if ("data-uri".equals(a.this.f30389j)) {
                                a.this.C(findViewById);
                            }
                        }
                        a.this.B(findViewById);
                    } else {
                        a.this.E(findViewById);
                    }
                } else {
                    a.this.D(findViewById);
                }
            } catch (Throwable th) {
                Log.e(a.f30376p, "Failed to capture view snapshot", th);
                a.this.f30390k.reject("E_UNABLE_TO_SNAPSHOT", "Failed to capture view snapshot");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewShot.java */
    /* loaded from: classes3.dex */
    public class c implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Canvas f30398a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f30399b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f30400c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Bitmap f30401d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Paint f30402e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f30403f;

        c(Canvas canvas, View view, View view2, Bitmap bitmap, Paint paint, CountDownLatch countDownLatch) {
            this.f30398a = canvas;
            this.f30399b = view;
            this.f30400c = view2;
            this.f30401d = bitmap;
            this.f30402e = paint;
            this.f30403f = countDownLatch;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i10) {
            int save = this.f30398a.save();
            a.this.r(this.f30398a, this.f30399b, this.f30400c);
            this.f30398a.drawBitmap(this.f30401d, 0.0f, 0.0f, this.f30402e);
            this.f30398a.restoreToCount(save);
            a.A(this.f30401d);
            this.f30403f.countDown();
        }
    }

    /* compiled from: ViewShot.java */
    /* loaded from: classes3.dex */
    public @interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final Bitmap.CompressFormat[] f30405a = {Bitmap.CompressFormat.JPEG, Bitmap.CompressFormat.PNG, Bitmap.CompressFormat.WEBP};
    }

    /* compiled from: ViewShot.java */
    /* loaded from: classes3.dex */
    public static class e extends ByteArrayOutputStream {
        public e(byte[] bArr) {
            super(0);
            ((ByteArrayOutputStream) this).buf = bArr;
        }

        protected static int d(int i10) {
            if (i10 >= 0) {
                if (i10 > 2147483639) {
                    return Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
                return 2147483639;
            }
            throw new OutOfMemoryError();
        }

        public ByteBuffer a(int i10) {
            if (((ByteArrayOutputStream) this).buf.length < i10) {
                b(i10);
            }
            return ByteBuffer.wrap(((ByteArrayOutputStream) this).buf);
        }

        protected void b(int i10) {
            int length = ((ByteArrayOutputStream) this).buf.length << 1;
            if (length - i10 < 0) {
                length = i10;
            }
            if (length - 2147483639 > 0) {
                length = d(i10);
            }
            ((ByteArrayOutputStream) this).buf = Arrays.copyOf(((ByteArrayOutputStream) this).buf, length);
        }

        public byte[] e() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public void h(int i10) {
            ((ByteArrayOutputStream) this).count = i10;
        }
    }

    public a(int i10, String str, @d int i11, double d10, Integer num, Integer num2, File file, String str2, Boolean bool, ReactApplicationContext reactApplicationContext, Activity activity, boolean z10, Promise promise) {
        this.f30382c = i10;
        this.f30383d = str;
        this.f30384e = i11;
        this.f30385f = d10;
        this.f30386g = num;
        this.f30387h = num2;
        this.f30388i = file;
        this.f30389j = str2;
        this.f30391l = bool;
        this.f30392m = reactApplicationContext;
        this.f30394o = activity;
        this.f30393n = z10;
        this.f30390k = promise;
        reactApplicationContext.addLifecycleEventListener(this);
        HandlerThread handlerThread = new HandlerThread("RNViewShot-Handler-Thread");
        this.f30380a = handlerThread;
        handlerThread.start();
        this.f30381b = new Handler(this.f30380a.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void A(Bitmap bitmap) {
        synchronized (f30378r) {
            f30379s.add(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(View view) throws IOException {
        String str;
        boolean z10 = -1 == this.f30384e;
        boolean equals = "zip-base64".equals(this.f30389j);
        e eVar = new e(f30377q);
        Point s10 = s(view, eVar);
        f30377q = eVar.e();
        int size = eVar.size();
        String format = String.format(Locale.US, "%d:%d|", Integer.valueOf(s10.x), Integer.valueOf(s10.y));
        if (!z10) {
            format = "";
        }
        if (equals) {
            Deflater deflater = new Deflater();
            deflater.setInput(f30377q, 0, size);
            deflater.finish();
            e eVar2 = new e(new byte[32]);
            byte[] bArr = new byte[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];
            while (!deflater.finished()) {
                eVar2.write(bArr, 0, deflater.deflate(bArr));
            }
            str = format + Base64.encodeToString(eVar2.e(), 0, eVar2.size(), 2);
        } else {
            str = format + Base64.encodeToString(f30377q, 0, size, 2);
        }
        this.f30390k.resolve(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(View view) throws IOException {
        e eVar = new e(f30377q);
        s(view, eVar);
        f30377q = eVar.e();
        String encodeToString = Base64.encodeToString(f30377q, 0, eVar.size(), 2);
        String str = "jpg".equals(this.f30383d) ? "jpeg" : this.f30383d;
        Promise promise = this.f30390k;
        promise.resolve("data:image/" + str + ";base64," + encodeToString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(View view) throws IOException {
        String uri = Uri.fromFile(this.f30388i).toString();
        FileOutputStream fileOutputStream = new FileOutputStream(this.f30388i);
        e eVar = new e(f30377q);
        Point s10 = s(view, eVar);
        f30377q = eVar.e();
        int size = eVar.size();
        fileOutputStream.write(String.format(Locale.US, "%d:%d|", Integer.valueOf(s10.x), Integer.valueOf(s10.y)).getBytes(Charset.forName("US-ASCII")));
        fileOutputStream.write(f30377q, 0, size);
        fileOutputStream.close();
        this.f30390k.resolve(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(View view) throws IOException {
        s(view, new FileOutputStream(this.f30388i));
        this.f30390k.resolve(Uri.fromFile(this.f30388i).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Matrix r(Canvas canvas, View view, View view2) {
        Matrix matrix = new Matrix();
        LinkedList linkedList = new LinkedList();
        View view3 = view2;
        do {
            linkedList.add(view3);
            view3 = (View) view3.getParent();
        } while (view3 != view);
        Collections.reverse(linkedList);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            View view4 = (View) it.next();
            canvas.save();
            int i10 = 0;
            float left = view4.getLeft() + (view4 != view2 ? view4.getPaddingLeft() : 0) + view4.getTranslationX();
            int top = view4.getTop();
            if (view4 != view2) {
                i10 = view4.getPaddingTop();
            }
            float translationY = top + i10 + view4.getTranslationY();
            canvas.translate(left, translationY);
            canvas.rotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            canvas.scale(view4.getScaleX(), view4.getScaleY());
            matrix.postTranslate(left, translationY);
            matrix.postRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            matrix.postScale(view4.getScaleX(), view4.getScaleY());
        }
        return matrix;
    }

    private Point s(View view, OutputStream outputStream) throws IOException {
        try {
            be.a.d(f30376p, be.a.b(this.f30394o));
            return t(view, outputStream);
        } finally {
            outputStream.close();
        }
    }

    private Point t(View view, OutputStream outputStream) {
        int i10;
        Bitmap bitmap;
        Paint paint;
        Bitmap bitmap2;
        Point point;
        Canvas canvas;
        Paint paint2;
        SurfaceView surfaceView;
        View view2 = view;
        int width = view.getWidth();
        int height = view.getHeight();
        if (width > 0 && height > 0) {
            boolean z10 = false;
            if (this.f30391l.booleanValue()) {
                ScrollView scrollView = (ScrollView) view2;
                int i11 = 0;
                for (int i12 = 0; i12 < scrollView.getChildCount(); i12++) {
                    i11 += scrollView.getChildAt(i12).getHeight();
                }
                i10 = i11;
            } else {
                i10 = height;
            }
            Point point2 = new Point(width, i10);
            Bitmap x10 = x(width, i10);
            Paint paint3 = new Paint();
            int i13 = 1;
            paint3.setAntiAlias(true);
            paint3.setFilterBitmap(true);
            paint3.setDither(true);
            Canvas canvas2 = new Canvas(x10);
            view2.draw(canvas2);
            for (View view3 : w(view)) {
                if (view3 instanceof TextureView) {
                    if (view3.getVisibility() == 0) {
                        TextureView textureView = (TextureView) view3;
                        textureView.setOpaque(z10);
                        Bitmap bitmap3 = textureView.getBitmap(y(view3.getWidth(), view3.getHeight()));
                        int save = canvas2.save();
                        r(canvas2, view2, view3);
                        canvas2.drawBitmap(bitmap3, 0.0f, 0.0f, paint3);
                        canvas2.restoreToCount(save);
                        A(bitmap3);
                    }
                } else if ((view3 instanceof SurfaceView) && this.f30393n) {
                    SurfaceView surfaceView2 = (SurfaceView) view3;
                    CountDownLatch countDownLatch = new CountDownLatch(i13);
                    if (Build.VERSION.SDK_INT >= 24) {
                        Bitmap y10 = y(view3.getWidth(), view3.getHeight());
                        try {
                            surfaceView = surfaceView2;
                            point = point2;
                            canvas = canvas2;
                            paint = paint3;
                            bitmap2 = x10;
                        } catch (Exception e10) {
                            e = e10;
                            surfaceView = surfaceView2;
                            paint = paint3;
                            bitmap2 = x10;
                            point = point2;
                            canvas = canvas2;
                        }
                        try {
                            PixelCopy.request(surfaceView, y10, new c(canvas2, view, view3, y10, paint3, countDownLatch), new Handler(Looper.getMainLooper()));
                            countDownLatch.await(5L, TimeUnit.SECONDS);
                        } catch (Exception e11) {
                            e = e11;
                            String str = f30376p;
                            Log.e(str, "Cannot PixelCopy for " + surfaceView, e);
                            paint2 = paint;
                            view2 = view;
                            paint3 = paint2;
                            x10 = bitmap2;
                            canvas2 = canvas;
                            point2 = point;
                            i13 = 1;
                            z10 = false;
                        }
                    } else {
                        paint = paint3;
                        bitmap2 = x10;
                        point = point2;
                        canvas = canvas2;
                        if (surfaceView2.getDrawingCache() != null) {
                            paint2 = paint;
                            canvas.drawBitmap(surfaceView2.getDrawingCache(), 0.0f, 0.0f, paint2);
                            view2 = view;
                            paint3 = paint2;
                            x10 = bitmap2;
                            canvas2 = canvas;
                            point2 = point;
                            i13 = 1;
                            z10 = false;
                        }
                    }
                    paint2 = paint;
                    view2 = view;
                    paint3 = paint2;
                    x10 = bitmap2;
                    canvas2 = canvas;
                    point2 = point;
                    i13 = 1;
                    z10 = false;
                }
                paint2 = paint3;
                bitmap2 = x10;
                point = point2;
                canvas = canvas2;
                view2 = view;
                paint3 = paint2;
                x10 = bitmap2;
                canvas2 = canvas;
                point2 = point;
                i13 = 1;
                z10 = false;
            }
            Bitmap bitmap4 = x10;
            Point point3 = point2;
            Integer num = this.f30386g;
            if (num == null || this.f30387h == null || (num.intValue() == width && this.f30387h.intValue() == i10)) {
                bitmap = bitmap4;
            } else {
                bitmap = Bitmap.createScaledBitmap(bitmap4, this.f30386g.intValue(), this.f30387h.intValue(), true);
                A(bitmap4);
            }
            int i14 = this.f30384e;
            if (-1 == i14 && (outputStream instanceof e)) {
                int i15 = width * i10 * 4;
                e eVar = (e) u(outputStream);
                bitmap.copyPixelsToBuffer(eVar.a(i15));
                eVar.h(i15);
            } else {
                bitmap.compress(d.f30405a[i14], (int) (this.f30385f * 100.0d), outputStream);
            }
            A(bitmap);
            return point3;
        }
        throw new RuntimeException("Impossible to snapshot the view: view is invalid");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends A, A> T u(A a10) {
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        HandlerThread handlerThread = this.f30380a;
        if (handlerThread != null) {
            if (Build.VERSION.SDK_INT < 18) {
                handlerThread.quit();
            } else {
                handlerThread.quitSafely();
            }
            this.f30380a = null;
        }
    }

    private List<View> w(View view) {
        if (!(view instanceof ViewGroup)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            arrayList2.addAll(w(viewGroup.getChildAt(i10)));
        }
        return arrayList2;
    }

    private static Bitmap x(int i10, int i11) {
        synchronized (f30378r) {
            for (Bitmap bitmap : f30379s) {
                if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
                    f30379s.remove(bitmap);
                    bitmap.eraseColor(0);
                    return bitmap;
                }
            }
            return Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        }
    }

    private static Bitmap y(int i10, int i11) {
        synchronized (f30378r) {
            for (Bitmap bitmap : f30379s) {
                if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
                    f30379s.remove(bitmap);
                    bitmap.eraseColor(0);
                    return bitmap;
                }
            }
            return Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int z(View view) {
        return Math.min(view.getWidth() * view.getHeight() * 4, 32);
    }

    @Override // com.facebook.react.uimanager.q0
    public void a(n nVar) {
        this.f30381b.post(new b(nVar));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.f30392m.removeLifecycleEventListener(this);
        this.f30381b.post(new RunnableC0388a());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }
}
