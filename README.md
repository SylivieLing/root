# Report de SE TP1

Author : Sylvie(leader), Olivia(collaborator)

March 18 2024

[the url of the repo](https://github.com/SylivieLing/root)

This is our commit history of our repo with explanation

![commit history](img/commit_history.png)

## Exo 1

### 1. The leader: Create your local repo with "git init” 

We create the local repo with "git init" on the computer of leader(Sylvie).

![git init](img/exo1.1.png)

### 2. Put your repo on Gitee to make this a remote repo

We put our repo on Github.

![remote repo](img/exo1.2.png)

### 3. Add member

Leader's account add the collaborator(Olivia) on the "Setting" page.

![add member](img/exo1.3.png)

### 4. Set the working directory (workspace) identical to the directory of your local repo

For the leader, just set the workspace identical to the directory of local repo.

![leader set workspace](img/exo1.4.1.png)

For the collaborator, use `git clone` command to import the remote repo.

> The collaborator forgot to take a screenshot for this step.

And set the workspace to the directory of lacal repo.

![collaborator set woekspace](img/exo1.4.2.jpg)

### 5. Active the Git view in your IDE

![git view in IDE](img/exo1.5.png)

## img/exo2: Exception Handling

### 1. Create a new Java project named "Error Handling"

![create project](img/exo2.1.png)

### 2. create a new package named “dividedbyzero”, then create the Main.java file

![create package1](img/exo2.2.png)

And run the program.

![run the program](img/exo2.2.2.png)

### 3. The program triggers an Exception.

1. For the leader: Modify the programe with try/catch, use catch (Exception e) to handle the error message and print the error message in the form of `Caught runtime exception = %s\n`.

![catch (Exception e)](img/exo2.3.1.png)

2. Commit this version and pull it to the remote repository. (with message information : “try/catch block added”)

![commit and push](img/exo2.3.2.png)

3. For the collaborator: Once the new version is pushed to the repository, update your local repo with git pull.

![pull](img/exo2.3.3.png)

4. For the collaborator: specify the exception to be caught by: catch (ArithmeticException e)

![specify the exception](img/exo2.3.4.jpg)

Then, commit (with message information: “Exception specified”) and push the new version to the remote repo.

![commit and push](img/exo2.3.4.2.png)

### 4.

In Create a new package named “CallExceptionMethods”. In this package, create a Main.java class.

![create package2](img/exo2.4.png)

with follong code.

![Main.java class](img/exo2.4.2.png)

And complete the commented part in green.

![part in green](img/exo2.4.3.png)

Commit and push the corresponding files to the remote repo with message “img/exo 2”.

![commit and push 2](img/exo2.4.4.png)