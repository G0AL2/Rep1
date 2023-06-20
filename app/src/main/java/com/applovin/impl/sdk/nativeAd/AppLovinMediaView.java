package com.applovin.impl.sdk.nativeAd;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.R;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class AppLovinMediaView extends FrameLayout {
    private static final String TAG = "AppLovinMediaView";

    /* renamed from: ad  reason: collision with root package name */
    private final AppLovinNativeAdImpl f8588ad;
    private final ImageView imageView;
    private final boolean isVideoMuted;
    private final com.applovin.impl.sdk.utils.a lifecycleCallbacksAdapter;
    private final v logger;
    private MediaPlayer mediaPlayer;
    private final m sdk;
    private final a videoUiEventHandler;
    private AppLovinVideoView videoView;

    /* loaded from: classes.dex */
    private class a implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener {
        private a() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (v.a()) {
                AppLovinMediaView.this.logger.b(AppLovinMediaView.TAG, "Video completed");
            }
            if (AppLovinMediaView.this.videoView != null) {
                AppLovinMediaView.this.videoView.setVisibility(8);
            }
            AppLovinMediaView.this.imageView.setVisibility(0);
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            if (v.a()) {
                String str = "Video view error (" + i10 + "," + i11 + ")";
                AppLovinMediaView.this.logger.e(AppLovinMediaView.TAG, "Encountered media error: " + str + " for ad: " + AppLovinMediaView.this.f8588ad);
                return true;
            }
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            if (v.a()) {
                v vVar = AppLovinMediaView.this.logger;
                vVar.b(AppLovinMediaView.TAG, "MediaPlayer Info: (" + i10 + ", " + i11 + ")");
                return false;
            }
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            AppLovinMediaView.this.mediaPlayer = mediaPlayer;
            mediaPlayer.setOnInfoListener(AppLovinMediaView.this.videoUiEventHandler);
            mediaPlayer.setOnErrorListener(AppLovinMediaView.this.videoUiEventHandler);
            float f10 = !AppLovinMediaView.this.isVideoMuted ? 1 : 0;
            mediaPlayer.setVolume(f10, f10);
            if (v.a()) {
                AppLovinMediaView.this.logger.b(AppLovinMediaView.TAG, "MediaPlayer prepared: " + AppLovinMediaView.this.mediaPlayer);
            }
        }
    }

    public AppLovinMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, m mVar, Context context) {
        super(context);
        a aVar = new a();
        this.videoUiEventHandler = aVar;
        com.applovin.impl.sdk.utils.a aVar2 = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinMediaView.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                if (AppLovinMediaView.this.videoView != null) {
                    AppLovinMediaView.this.videoView.pause();
                }
            }

            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                if (AppLovinMediaView.this.videoView != null) {
                    AppLovinMediaView.this.videoView.start();
                }
            }
        };
        this.lifecycleCallbacksAdapter = aVar2;
        setBackgroundColor(-16777216);
        this.f8588ad = appLovinNativeAdImpl;
        this.sdk = mVar;
        this.logger = mVar.A();
        this.isVideoMuted = true;
        LayoutInflater.from(context).inflate(R.layout.applovin_native_ad_media_view, (ViewGroup) this, true);
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        com.applovin.impl.a.a vastAd = appLovinNativeAdImpl.getVastAd();
        Uri h10 = vastAd != null ? vastAd.h() : null;
        if (mainImageUri == null && h10 == null) {
            throw new IllegalStateException("AppLovin native ad missing image AND video resources");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        setOnClickListener(appLovinNativeAdImpl.getClickHandler());
        ImageView imageView = (ImageView) findViewById(R.id.image_view);
        this.imageView = imageView;
        if (mainImageUri != null) {
            imageView.setImageURI(mainImageUri);
        }
        if (h10 != null) {
            mVar.af().a(aVar2);
            AppLovinVideoView appLovinVideoView = new AppLovinVideoView(context);
            this.videoView = appLovinVideoView;
            appLovinVideoView.setOnPreparedListener(aVar);
            this.videoView.setOnCompletionListener(aVar);
            this.videoView.setOnErrorListener(aVar);
            this.videoView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            addView(this.videoView);
            this.videoView.setVideoURI(h10);
            imageView.setVisibility(8);
        } else {
            this.videoView = null;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public void destroy() {
        setOnClickListener(null);
        this.sdk.af().b(this.lifecycleCallbacksAdapter);
        try {
            AppLovinVideoView appLovinVideoView = this.videoView;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.videoView.stopPlayback();
                this.videoView.setOnPreparedListener(null);
                this.videoView.setOnCompletionListener(null);
                this.videoView.setOnErrorListener(null);
                this.videoView = null;
            }
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                this.mediaPlayer = null;
            }
        } catch (Throwable th) {
            Log.d(TAG, "Encountered exception when destroying:" + th);
        }
        removeAllViews();
    }

    public float getAspectRatio() {
        Drawable drawable;
        ImageView imageView = this.imageView;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AppLovinVideoView appLovinVideoView = this.videoView;
        if (appLovinVideoView != null) {
            appLovinVideoView.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        AppLovinVideoView appLovinVideoView = this.videoView;
        if (appLovinVideoView != null) {
            appLovinVideoView.pause();
        }
        super.onDetachedFromWindow();
    }
}
