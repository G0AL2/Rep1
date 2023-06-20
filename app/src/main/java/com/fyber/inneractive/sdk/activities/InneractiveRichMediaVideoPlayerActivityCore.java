package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.VideoView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public class InneractiveRichMediaVideoPlayerActivityCore extends Activity {
    public static final String VIDEO_CURRENT_POSITION = "video_current_position";
    public static final String VIDEO_URL = "video_url";

    /* renamed from: a  reason: collision with root package name */
    public VideoView f16690a;

    /* renamed from: b  reason: collision with root package name */
    public int f16691b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final MediaPlayer.OnPreparedListener f16692c = new a();

    /* loaded from: classes.dex */
    public class a implements MediaPlayer.OnPreparedListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            IAlog.a("onPrepared", new Object[0]);
            InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore = InneractiveRichMediaVideoPlayerActivityCore.this;
            inneractiveRichMediaVideoPlayerActivityCore.f16690a.seekTo(inneractiveRichMediaVideoPlayerActivityCore.f16691b);
            InneractiveRichMediaVideoPlayerActivityCore.this.f16690a.start();
        }
    }

    public static boolean startRichMediaIntent(Context context, String str) {
        Intent intent = new Intent(context, InneractiveRichMediaVideoPlayerActivityCore.class);
        intent.setFlags(268435456);
        intent.putExtra(VIDEO_URL, str);
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            IAlog.a("Activity InneractiveRichMediaVideoPlayerActivityCore was not found. Did you declare it in your AndroidManifest.xml?", new Object[0]);
            return false;
        }
    }

    public void initWindowFeatures() {
        requestWindowFeature(1);
        getWindow().addFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
        getWindow().addFlags(128);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        initWindowFeatures();
        super.onCreate(bundle);
        if (bundle != null) {
            this.f16691b = bundle.getInt(VIDEO_CURRENT_POSITION, 0);
        }
        setContentView(R.layout.ia_rich_media_video);
        this.f16690a = (VideoView) findViewById(R.id.mraid_video_view);
        Intent intent = getIntent();
        String stringExtra = (intent == null || !intent.hasExtra(VIDEO_URL)) ? null : intent.getStringExtra(VIDEO_URL);
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.a("Error: video can not be played.", new Object[0]);
            finish();
        } else {
            this.f16690a.setVideoPath(stringExtra);
            this.f16690a.setOnCompletionListener(new h(this));
            this.f16690a.setOnErrorListener(new i(this));
            this.f16690a.setOnPreparedListener(this.f16692c);
        }
        findViewById(R.id.ia_iv_close_button).setOnClickListener(new g(this));
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f16691b = this.f16690a.getCurrentPosition();
        this.f16690a.pause();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        VideoView videoView = this.f16690a;
        bundle.putInt(VIDEO_CURRENT_POSITION, videoView == null ? 0 : videoView.getCurrentPosition());
    }
}
