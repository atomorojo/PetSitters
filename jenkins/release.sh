

# exit 1 on errors
set -e

# deal with remote
echo "Checking if remote exists..."
if ! git ls-remote heroku; then
  echo "Adding heroku remote..."
    heroku git:remote -a petshit
fi

# push only origin/master to heroku/master - will do nothing if
# master doesn't change.
echo "Updating heroku master branch..."
git push heroku master
