package md582547637a2d8d1feb0e056b94ee759e6;


public class CachedImageFastRenderer
	extends md582547637a2d8d1feb0e056b94ee759e6.CachedImageView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"";
		mono.android.Runtime.register ("FFImageLoading.Forms.Platform.CachedImageFastRenderer, FFImageLoading.Forms.Platform, Version=2.4.3.840, Culture=neutral, PublicKeyToken=null", CachedImageFastRenderer.class, __md_methods);
	}


	public CachedImageFastRenderer (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == CachedImageFastRenderer.class)
			mono.android.TypeManager.Activate ("FFImageLoading.Forms.Platform.CachedImageFastRenderer, FFImageLoading.Forms.Platform, Version=2.4.3.840, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public CachedImageFastRenderer (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == CachedImageFastRenderer.class)
			mono.android.TypeManager.Activate ("FFImageLoading.Forms.Platform.CachedImageFastRenderer, FFImageLoading.Forms.Platform, Version=2.4.3.840, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public CachedImageFastRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == CachedImageFastRenderer.class)
			mono.android.TypeManager.Activate ("FFImageLoading.Forms.Platform.CachedImageFastRenderer, FFImageLoading.Forms.Platform, Version=2.4.3.840, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public CachedImageFastRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) throws java.lang.Throwable
	{
		super (p0, p1, p2, p3);
		if (getClass () == CachedImageFastRenderer.class)
			mono.android.TypeManager.Activate ("FFImageLoading.Forms.Platform.CachedImageFastRenderer, FFImageLoading.Forms.Platform, Version=2.4.3.840, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
