package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import mf.e0;

/* loaded from: classes3.dex */
public abstract class RequestHandler {

    /* loaded from: classes3.dex */
    public static final class Result {
        private final Bitmap bitmap;
        private final int exifOrientation;
        private final Picasso.LoadedFrom loadedFrom;
        private final e0 source;

        public Result(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            this((Bitmap) Utils.checkNotNull(bitmap, "bitmap == null"), null, loadedFrom, 0);
        }

        public Bitmap getBitmap() {
            return this.bitmap;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getExifOrientation() {
            return this.exifOrientation;
        }

        public Picasso.LoadedFrom getLoadedFrom() {
            return this.loadedFrom;
        }

        public e0 getSource() {
            return this.source;
        }

        public Result(e0 e0Var, Picasso.LoadedFrom loadedFrom) {
            this(null, (e0) Utils.checkNotNull(e0Var, "source == null"), loadedFrom, 0);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Result(Bitmap bitmap, e0 e0Var, Picasso.LoadedFrom loadedFrom, int i10) {
            if ((bitmap != null) != (e0Var != null)) {
                this.bitmap = bitmap;
                this.source = e0Var;
                this.loadedFrom = (Picasso.LoadedFrom) Utils.checkNotNull(loadedFrom, "loadedFrom == null");
                this.exifOrientation = i10;
                return;
            }
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void calculateInSampleSize(int i10, int i11, BitmapFactory.Options options, Request request) {
        calculateInSampleSize(i10, i11, options.outWidth, options.outHeight, options, request);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BitmapFactory.Options createBitmapOptions(Request request) {
        boolean hasSize = request.hasSize();
        boolean z10 = request.config != null;
        BitmapFactory.Options options = null;
        if (hasSize || z10 || request.purgeable) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = hasSize;
            boolean z11 = request.purgeable;
            options.inInputShareable = z11;
            options.inPurgeable = z11;
            if (z10) {
                options.inPreferredConfig = request.config;
            }
        }
        return options;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean requiresInSampleSize(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean canHandleRequest(Request request);

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getRetryCount() {
        return 0;
    }

    public abstract Result load(Request request, int i10) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean shouldRetry(boolean z10, NetworkInfo networkInfo) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean supportsReplay() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void calculateInSampleSize(int i10, int i11, int i12, int i13, BitmapFactory.Options options, Request request) {
        int min;
        double floor;
        if (i13 > i11 || i12 > i10) {
            if (i11 == 0) {
                floor = Math.floor(i12 / i10);
            } else if (i10 == 0) {
                floor = Math.floor(i13 / i11);
            } else {
                int floor2 = (int) Math.floor(i13 / i11);
                int floor3 = (int) Math.floor(i12 / i10);
                if (request.centerInside) {
                    min = Math.max(floor2, floor3);
                } else {
                    min = Math.min(floor2, floor3);
                }
            }
            min = (int) floor;
        } else {
            min = 1;
        }
        options.inSampleSize = min;
        options.inJustDecodeBounds = false;
    }
}
