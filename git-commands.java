Git Commands


1)git init 
function : To initialize empty git repository in local server

2)git config --global user.name "Akhilesh Moonat" 
function : To set user name for your initial set up of git bash 

3)git config --global user.email "akhilesh.moonat@gmail.com" 
function : To set email of user for your initial set up of git bash 

4)mkdir abc
function : To create a directory/repository in your local server 

5)cd abc
function : To change the directory

6)touch efg.txt
function : To create a file named as efg.txt in the local repository abc

7)git commit -m "Initial Commit"
function : To commit an recently created files

8)git add efg.txt
function : Add one or more files to staging(index)

9)git status
function : Tells the current status of files created,commited and modified till now.

10)git commit -a 
function : Commit any files you have added with git add, and also commit any files you have changed since then

11)git remote add origin <URL of your remote repository> 
function:to add the url of your remote repository so that remote repository could be connected with the local repository

12)git push origin master
function:To push the local repository to the remote repository

13)git log
function:It displays all the operations performed on the local repository till now.

14)git grep "abc()"
function:Search the working directory for abc()Git Commands

15)git remote -v
function:List all currently configured remote repositories

16)git pull
function:Fetch and merge changes on the remote server to your working directory.