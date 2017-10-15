# The Adapter Pattern
---

You have been using `FacebookPoster` in your application to post and get messages from facebook. Specifically, your code is full with calls to the `postMessage` and `getMessage` methods from the `FacebookPoster` class. Unfortunately, Facebook decided to change its provided API and now you have to use `NewFacebookPoster`. Instead of refactoring everything, you decide to use the **adapter pattern**.

Fill up the missing code in the `NewFacebokPosterAdapter` class, so that you use the newest Facebook API, but without destroying the previously used `FacebobkPoster` interface. Additionally, fill up the remaining code in the `Main` class, so you get the following results:

```
Using the NewFacebookPoster.post
Using the NewFacebookPoster.post
Using the NewFacebookPoster.get
Hello world! Still here!
Using the NewFacebookPoster.post
Using the NewFacebookPoster.get
Another day, another post!
```