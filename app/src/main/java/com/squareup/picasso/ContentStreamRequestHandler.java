package com.squareup.picasso;

import android.content.Context;
import com.applovin.sdk.AppLovinEventTypes;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import mf.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ContentStreamRequestHandler extends RequestHandler {
    final Context context;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ContentStreamRequestHandler(Context context) {
        this.context = context;
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        return AppLovinEventTypes.USER_VIEWED_CONTENT.equals(request.uri.getScheme());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputStream getInputStream(Request request) throws FileNotFoundException {
        return this.context.getContentResolver().openInputStream(request.uri);
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i10) throws IOException {
        return new RequestHandler.Result(r.k(getInputStream(request)), Picasso.LoadedFrom.DISK);
    }
}
