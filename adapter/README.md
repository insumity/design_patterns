# The Adapter Pattern
---

You have been using `FacebookPoster` in your application to post and get messages from Facebook. Specifically, your code is full with calls to the `postMessage` and `getMessage` methods from the `FacebookPoster` class. Unfortunately, Facebook decided to change its provided API and now you have to use `NewFacebookPoster`. Instead of refactoring everything, you decide to use the **adapter pattern**.

Create a new class with the name `NewFacebokPosterToFacebookPosterAdapter` and instantiate it in the `Main` class, so you get the following results:

```
Using the NewFacebookPoster.post
Using the NewFacebookPoster.post
Using the NewFacebookPoster.get
Hello world! Still here!
Using the NewFacebookPoster.post
Using the NewFacebookPoster.get
Another day, another post!
```
