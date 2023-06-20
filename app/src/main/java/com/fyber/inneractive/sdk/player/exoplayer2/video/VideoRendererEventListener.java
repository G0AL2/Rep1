package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Handler;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.i;

/* loaded from: classes2.dex */
public interface VideoRendererEventListener {

    /* loaded from: classes2.dex */
    public static final class EventDispatcher {
        private final Handler handler;
        private final VideoRendererEventListener listener;

        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DecoderCounters f19642a;

            public a(DecoderCounters decoderCounters) {
                this.f19642a = decoderCounters;
            }

            @Override // java.lang.Runnable
            public void run() {
                EventDispatcher.this.listener.onVideoEnabled(this.f19642a);
            }
        }

        /* loaded from: classes2.dex */
        public class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f19644a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ long f19645b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ long f19646c;

            public b(String str, long j10, long j11) {
                this.f19644a = str;
                this.f19645b = j10;
                this.f19646c = j11;
            }

            @Override // java.lang.Runnable
            public void run() {
                EventDispatcher.this.listener.onVideoDecoderInitialized(this.f19644a, this.f19645b, this.f19646c);
            }
        }

        /* loaded from: classes2.dex */
        public class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ i f19648a;

            public c(i iVar) {
                this.f19648a = iVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                EventDispatcher.this.listener.onVideoInputFormatChanged(this.f19648a);
            }
        }

        /* loaded from: classes2.dex */
        public class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f19650a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ long f19651b;

            public d(int i10, long j10) {
                this.f19650a = i10;
                this.f19651b = j10;
            }

            @Override // java.lang.Runnable
            public void run() {
                EventDispatcher.this.listener.onDroppedFrames(this.f19650a, this.f19651b);
            }
        }

        /* loaded from: classes2.dex */
        public class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f19653a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ int f19654b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ int f19655c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ float f19656d;

            public e(int i10, int i11, int i12, float f10) {
                this.f19653a = i10;
                this.f19654b = i11;
                this.f19655c = i12;
                this.f19656d = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                EventDispatcher.this.listener.onVideoSizeChanged(this.f19653a, this.f19654b, this.f19655c, this.f19656d);
            }
        }

        /* loaded from: classes2.dex */
        public class f implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Surface f19658a;

            public f(Surface surface) {
                this.f19658a = surface;
            }

            @Override // java.lang.Runnable
            public void run() {
                EventDispatcher.this.listener.onRenderedFirstFrame(this.f19658a);
            }
        }

        /* loaded from: classes2.dex */
        public class g implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DecoderCounters f19660a;

            public g(DecoderCounters decoderCounters) {
                this.f19660a = decoderCounters;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f19660a.ensureUpdated();
                EventDispatcher.this.listener.onVideoDisabled(this.f19660a);
            }
        }

        public EventDispatcher(Handler handler, VideoRendererEventListener videoRendererEventListener) {
            this.handler = videoRendererEventListener != null ? (Handler) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(handler) : null;
            this.listener = videoRendererEventListener;
        }

        public void decoderInitialized(String str, long j10, long j11) {
            if (this.listener != null) {
                this.handler.post(new b(str, j10, j11));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new g(decoderCounters));
            }
        }

        public void droppedFrames(int i10, long j10) {
            if (this.listener != null) {
                this.handler.post(new d(i10, j10));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new a(decoderCounters));
            }
        }

        public void inputFormatChanged(i iVar) {
            if (this.listener != null) {
                this.handler.post(new c(iVar));
            }
        }

        public void renderedFirstFrame(Surface surface) {
            if (this.listener != null) {
                this.handler.post(new f(surface));
            }
        }

        public void videoSizeChanged(int i10, int i11, int i12, float f10) {
            if (this.listener != null) {
                this.handler.post(new e(i10, i11, i12, f10));
            }
        }
    }

    void onDroppedFrames(int i10, long j10);

    void onRenderedFirstFrame(Surface surface);

    void onVideoDecoderInitialized(String str, long j10, long j11);

    void onVideoDisabled(DecoderCounters decoderCounters);

    void onVideoEnabled(DecoderCounters decoderCounters);

    void onVideoInputFormatChanged(i iVar);

    void onVideoSizeChanged(int i10, int i11, int i12, float f10);
}
