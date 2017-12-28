import pandas as pd, numpy as np


train = pd.read_csv('data/train.csv')
test = pd.read_csv('data/test.csv')

#train.head() displays top 5 rows
print (train.head())

#displaying first element of column "comment_text", the type is str
print (train['comment_text'][0])

#displaying mean, standard deviation and max value
lens = train.comment_text.str.len()
print (lens.mean(), lens.std(), lens.max())

lens.hist()

#Create new columns
label_cols = ['human', 'animal', 'bird']
train['none'] = 1-train[label_cols].max(axis=1)
print (train.describe())

#Displaying number of rows
print (len(train))
