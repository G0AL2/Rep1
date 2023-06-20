package com.applovin.impl.communicator;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7129a;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Queue<CommunicatorMessageImpl>> f7131c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Object f7132d = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f7130b = a();

    public MessagingServiceImpl(Context context) {
        this.f7129a = context;
    }

    private Queue<CommunicatorMessageImpl> a(String str) {
        LinkedList linkedList;
        synchronized (this.f7132d) {
            Queue<CommunicatorMessageImpl> queue = this.f7131c.get(str);
            linkedList = queue != null ? new LinkedList(queue) : new LinkedList();
        }
        return linkedList;
    }

    private ScheduledThreadPoolExecutor a() {
        return new ScheduledThreadPoolExecutor(4, new ThreadFactory() { // from class: com.applovin.impl.communicator.MessagingServiceImpl.2
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "AppLovinSdk:com.applovin.communicator");
                thread.setPriority(10);
                thread.setDaemon(true);
                return thread;
            }
        });
    }

    private void a(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (appLovinCommunicatorMessage.sticky) {
            synchronized (this.f7132d) {
                Queue<CommunicatorMessageImpl> queue = this.f7131c.get(appLovinCommunicatorMessage.getTopic());
                if (queue != null) {
                    queue.add(appLovinCommunicatorMessage);
                    if (queue.size() > 100) {
                        queue.remove();
                    }
                } else {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(appLovinCommunicatorMessage);
                    this.f7131c.put(appLovinCommunicatorMessage.getTopic(), linkedList);
                }
            }
        }
    }

    private void a(final CommunicatorMessageImpl communicatorMessageImpl) {
        this.f7130b.execute(new Runnable() { // from class: com.applovin.impl.communicator.MessagingServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                AppLovinBroadcastManager.getInstance(MessagingServiceImpl.this.f7129a).sendBroadcastSync(communicatorMessageImpl, null);
            }
        });
    }

    public void maybeFlushStickyMessages(String str) {
        for (CommunicatorMessageImpl communicatorMessageImpl : a(str)) {
            a(communicatorMessageImpl);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorMessagingService
    public void publish(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        a((CommunicatorMessageImpl) appLovinCommunicatorMessage);
        a(appLovinCommunicatorMessage);
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }
}
