package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* compiled from: NativeVideoWrapper.java */
/* loaded from: classes3.dex */
public class fk extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25435a = fk.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private fj f25436b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f25437c;

    /* renamed from: d  reason: collision with root package name */
    private ProgressBar f25438d;

    public fk(Context context) {
        super(context);
        this.f25436b = new fj(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.f25436b, layoutParams);
        ImageView imageView = new ImageView(getContext());
        this.f25437c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f25437c.setVisibility(8);
        addView(this.f25437c, layoutParams);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f25438d = progressBar;
        progressBar.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        addView(this.f25438d, layoutParams2);
        fi fiVar = new fi(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(13);
        this.f25436b.setMediaController(fiVar);
        addView(fiVar, layoutParams3);
    }

    public final void a() {
        RelativeLayout.LayoutParams layoutParams;
        double c10;
        double c11;
        cg cgVar = (cg) this.f25436b.getTag();
        if (cgVar != null) {
            try {
                String b10 = cgVar.b().b();
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(b10);
                int intValue = Integer.valueOf(mediaMetadataRetriever.extractMetadata(18)).intValue();
                int intValue2 = Integer.valueOf(mediaMetadataRetriever.extractMetadata(19)).intValue();
                mediaMetadataRetriever.release();
                Point point = cgVar.f24811c.f24834a;
                double d10 = intValue;
                double d11 = intValue2;
                if (fl.c(point.x) / fl.c(point.y) > d10 / d11) {
                    c10 = d10 * ((fl.c(point.y) * 1.0d) / d11);
                    c11 = fl.c(point.y);
                } else {
                    c10 = fl.c(point.x);
                    c11 = d11 * ((fl.c(point.x) * 1.0d) / d10);
                }
                layoutParams = new RelativeLayout.LayoutParams((int) c10, (int) c11);
            } catch (Exception e10) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                gg.a().a(new hg(e10));
                layoutParams = layoutParams2;
            }
            layoutParams.addRule(13);
            this.f25436b.setLayoutParams(layoutParams);
        }
    }

    public ImageView getPoster() {
        return this.f25437c;
    }

    public ProgressBar getProgressBar() {
        return this.f25438d;
    }

    public fj getVideoView() {
        return this.f25436b;
    }

    public void setPosterImage(Bitmap bitmap) {
        this.f25437c.setImageBitmap(bitmap);
    }
}
