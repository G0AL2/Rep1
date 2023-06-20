package com.inmobi.media;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: MediaRenderView.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class cy extends VideoView implements Application.ActivityLifecycleCallbacks, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {

    /* renamed from: l  reason: collision with root package name */
    private static final String f25042l = cy.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public a f25043a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f25044b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f25045c;

    /* renamed from: d  reason: collision with root package name */
    public b f25046d;

    /* renamed from: e  reason: collision with root package name */
    int f25047e;

    /* renamed from: f  reason: collision with root package name */
    boolean f25048f;

    /* renamed from: g  reason: collision with root package name */
    public String f25049g;

    /* renamed from: h  reason: collision with root package name */
    public String f25050h;

    /* renamed from: i  reason: collision with root package name */
    boolean f25051i;

    /* renamed from: j  reason: collision with root package name */
    int f25052j;

    /* renamed from: k  reason: collision with root package name */
    int f25053k;

    /* renamed from: m  reason: collision with root package name */
    private boolean f25054m;

    /* renamed from: n  reason: collision with root package name */
    private WeakReference<Activity> f25055n;

    /* compiled from: MediaRenderView.java */
    /* loaded from: classes3.dex */
    public static class a extends MediaController {
        public a(Context context) {
            super(context);
        }

        @Override // android.widget.MediaController
        public final void show(int i10) {
            super.show(i10);
            if (Build.VERSION.SDK_INT < 19) {
                try {
                    Field declaredField = MediaController.class.getDeclaredField("mAnchor");
                    declaredField.setAccessible(true);
                    View view = (View) declaredField.get(this);
                    Field declaredField2 = MediaController.class.getDeclaredField("mDecor");
                    declaredField2.setAccessible(true);
                    View view2 = (View) declaredField2.get(this);
                    Field declaredField3 = MediaController.class.getDeclaredField("mDecorLayoutParams");
                    declaredField3.setAccessible(true);
                    WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) declaredField3.get(this);
                    Field declaredField4 = MediaController.class.getDeclaredField("mWindowManager");
                    declaredField4.setAccessible(true);
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    view2.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), RecyclerView.UNDEFINED_DURATION), View.MeasureSpec.makeMeasureSpec(view.getHeight(), RecyclerView.UNDEFINED_DURATION));
                    view2.setPadding(0, 0, 0, 0);
                    layoutParams.verticalMargin = 0.0f;
                    layoutParams.horizontalMargin = 0.0f;
                    layoutParams.width = view.getWidth();
                    layoutParams.gravity = 8388659;
                    layoutParams.x = iArr[0];
                    layoutParams.y = (iArr[1] + view.getHeight()) - view2.getMeasuredHeight();
                    ((WindowManager) declaredField4.get(this)).updateViewLayout(view2, layoutParams);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MediaRenderView.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a();

        void a(cy cyVar);
    }

    public cy(Activity activity) {
        super(activity);
        this.f25054m = false;
        setZOrderOnTop(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT < 28) {
            setDrawingCacheEnabled(true);
        }
        this.f25047e = 100;
        this.f25052j = -1;
        this.f25053k = 0;
        this.f25048f = false;
        this.f25055n = new WeakReference<>(activity);
        ho.a(activity, this);
    }

    private void c() {
        ViewGroup viewGroup = this.f25045c;
        if (viewGroup != null) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f25045c);
            }
            ViewGroup viewGroup3 = (ViewGroup) getParent();
            if (viewGroup3 != null) {
                viewGroup3.removeView(this);
            }
            setBackgroundColor(0);
            this.f25045c = null;
        }
    }

    public final ViewGroup getViewContainer() {
        return this.f25045c;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f25055n.get() == null || !this.f25055n.get().equals(activity)) {
            return;
        }
        this.f25054m = false;
        start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Activity activity2 = this.f25055n.get();
        if (activity2 == null || !activity2.equals(activity)) {
            return;
        }
        this.f25054m = true;
        if (getCurrentPosition() != 0) {
            this.f25053k = getCurrentPosition();
        }
        pause();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        a();
        return false;
    }

    @Override // android.widget.VideoView, android.view.View
    protected final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        getHolder().setSizeFromLayout();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.inmobi.media.cy.1
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer2, int i10, int i11) {
                String unused = cy.f25042l;
                if (cy.this.f25043a == null) {
                    cy.this.f25043a = new a(cy.this.getContext());
                    cy.this.f25043a.setAnchorView(cy.this);
                    cy cyVar = cy.this;
                    cyVar.setMediaController(cyVar.f25043a);
                    cy.this.requestLayout();
                    cy.this.requestFocus();
                }
            }
        });
        int i10 = this.f25053k;
        if (i10 < getDuration()) {
            this.f25053k = i10;
            seekTo(i10);
        }
        this.f25051i = true;
        this.f25046d.a();
        start();
    }

    @Override // android.view.View
    @TargetApi(16)
    protected final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            if (Build.VERSION.SDK_INT >= 16) {
                Context c10 = ho.c();
                if (c10 != null) {
                    setBackground(new BitmapDrawable(c10.getResources(), this.f25044b));
                    return;
                }
                return;
            }
            setBackgroundDrawable(new BitmapDrawable(this.f25044b));
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        super.pause();
    }

    public final void setListener(b bVar) {
        this.f25046d = bVar;
    }

    public final void setPlaybackData(String str) {
        this.f25050h = a(str);
        this.f25049g = "anonymous";
        if (this.f25044b == null) {
            this.f25044b = Bitmap.createBitmap(24, 24, Bitmap.Config.ARGB_8888);
            this.f25044b = b(this.f25050h);
        }
    }

    public final void setViewContainer(ViewGroup viewGroup) {
        this.f25045c = viewGroup;
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (this.f25054m) {
            return;
        }
        super.start();
    }

    public static Bitmap b(String str) {
        try {
            return (Bitmap) Class.forName("android.media.ThumbnailUtils").getDeclaredMethod("createVideoThumbnail", String.class, Integer.TYPE).invoke(null, str, 1);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void a() {
        stopPlayback();
        c();
        super.setMediaController(null);
        this.f25043a = null;
        b bVar = this.f25046d;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public static String a(String str) {
        byte[] bytes = str.getBytes();
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bytes) {
            if ((b10 & 128) > 0) {
                sb2.append("%");
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                sb2.append(new String(new char[]{cArr[(b10 >> 4) & 15], cArr[b10 & 15]}));
            } else {
                sb2.append((char) b10);
            }
        }
        try {
            return new String(sb2.toString().getBytes(), "ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }
}
