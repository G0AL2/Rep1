package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;
import mf.r;
import p0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FileRequestHandler extends ContentStreamRequestHandler {
    /* JADX INFO: Access modifiers changed from: package-private */
    public FileRequestHandler(Context context) {
        super(context);
    }

    static int getFileExifRotation(Uri uri) throws IOException {
        return new a(uri.getPath()).e("Orientation", 1);
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        return "file".equals(request.uri.getScheme());
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i10) throws IOException {
        return new RequestHandler.Result(null, r.k(getInputStream(request)), Picasso.LoadedFrom.DISK, getFileExifRotation(request.uri));
    }
}
