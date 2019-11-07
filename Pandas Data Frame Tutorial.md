

```python
import pandas as pd
```


```python
data = [['tom', 10], ['nick', 15], ['juli', 14]]
```


```python
#Create a dataframe

df = pd.DataFrame(data, columns = ['Name', 'Age'])
```


```python
df
```




<div>
<style scoped>
    .dataframe tbody tr th:only-of-type {
        vertical-align: middle;
    }

    .dataframe tbody tr th {
        vertical-align: top;
    }

    .dataframe thead th {
        text-align: right;
    }
</style>
<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>Name</th>
      <th>Age</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>tom</td>
      <td>10</td>
    </tr>
    <tr>
      <th>1</th>
      <td>nick</td>
      <td>15</td>
    </tr>
    <tr>
      <th>2</th>
      <td>juli</td>
      <td>14</td>
    </tr>
  </tbody>
</table>
</div>




```python
df["Null_Column"] = None
```


```python
df
```




<div>
<style scoped>
    .dataframe tbody tr th:only-of-type {
        vertical-align: middle;
    }

    .dataframe tbody tr th {
        vertical-align: top;
    }

    .dataframe thead th {
        text-align: right;
    }
</style>
<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>Name</th>
      <th>Age</th>
      <th>Null_Column</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>tom</td>
      <td>10</td>
      <td>None</td>
    </tr>
    <tr>
      <th>1</th>
      <td>nick</td>
      <td>15</td>
      <td>None</td>
    </tr>
    <tr>
      <th>2</th>
      <td>juli</td>
      <td>14</td>
      <td>None</td>
    </tr>
  </tbody>
</table>
</div>




```python
#Drop column if all values are null 
df.dropna(axis = 1, how ='all', inplace = True)
```


```python
df
```




<div>
<style scoped>
    .dataframe tbody tr th:only-of-type {
        vertical-align: middle;
    }

    .dataframe tbody tr th {
        vertical-align: top;
    }

    .dataframe thead th {
        text-align: right;
    }
</style>
<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>Name</th>
      <th>Age</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>tom</td>
      <td>10</td>
    </tr>
    <tr>
      <th>1</th>
      <td>nick</td>
      <td>15</td>
    </tr>
    <tr>
      <th>2</th>
      <td>juli</td>
      <td>14</td>
    </tr>
  </tbody>
</table>
</div>




```python
df["Null_Column"] = None
```


```python
df
```




<div>
<style scoped>
    .dataframe tbody tr th:only-of-type {
        vertical-align: middle;
    }

    .dataframe tbody tr th {
        vertical-align: top;
    }

    .dataframe thead th {
        text-align: right;
    }
</style>
<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>Name</th>
      <th>Age</th>
      <th>Null_Column</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>tom</td>
      <td>10</td>
      <td>None</td>
    </tr>
    <tr>
      <th>1</th>
      <td>nick</td>
      <td>15</td>
      <td>None</td>
    </tr>
    <tr>
      <th>2</th>
      <td>juli</td>
      <td>14</td>
      <td>None</td>
    </tr>
  </tbody>
</table>
</div>




```python
df["Null_Column_2"] = None
```


```python
df
```




<div>
<style scoped>
    .dataframe tbody tr th:only-of-type {
        vertical-align: middle;
    }

    .dataframe tbody tr th {
        vertical-align: top;
    }

    .dataframe thead th {
        text-align: right;
    }
</style>
<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>Name</th>
      <th>Age</th>
      <th>Null_Column</th>
      <th>Null_Column_2</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>tom</td>
      <td>10</td>
      <td>None</td>
      <td>None</td>
    </tr>
    <tr>
      <th>1</th>
      <td>nick</td>
      <td>15</td>
      <td>None</td>
      <td>None</td>
    </tr>
    <tr>
      <th>2</th>
      <td>juli</td>
      <td>14</td>
      <td>None</td>
      <td>None</td>
    </tr>
  </tbody>
</table>
</div>




```python
df.fillna(value='ABC', axis='columns')
```




<div>
<style scoped>
    .dataframe tbody tr th:only-of-type {
        vertical-align: middle;
    }

    .dataframe tbody tr th {
        vertical-align: top;
    }

    .dataframe thead th {
        text-align: right;
    }
</style>
<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>Name</th>
      <th>Age</th>
      <th>Null_Column</th>
      <th>Null_Column_2</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>tom</td>
      <td>10</td>
      <td>ABC</td>
      <td>ABC</td>
    </tr>
    <tr>
      <th>1</th>
      <td>nick</td>
      <td>15</td>
      <td>ABC</td>
      <td>ABC</td>
    </tr>
    <tr>
      <th>2</th>
      <td>juli</td>
      <td>14</td>
      <td>ABC</td>
      <td>ABC</td>
    </tr>
  </tbody>
</table>
</div>




```python
#you can fill selected column with a value
#You can finally replace the df
df["new_col"] = df[['Null_Column_2']].fillna(value='ABC', axis='columns')
```


```python
df
```




<div>
<style scoped>
    .dataframe tbody tr th:only-of-type {
        vertical-align: middle;
    }

    .dataframe tbody tr th {
        vertical-align: top;
    }

    .dataframe thead th {
        text-align: right;
    }
</style>
<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>Name</th>
      <th>Age</th>
      <th>Null_Column</th>
      <th>Null_Column_2</th>
      <th>new_col</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>tom</td>
      <td>10</td>
      <td>None</td>
      <td>None</td>
      <td>ABC</td>
    </tr>
    <tr>
      <th>1</th>
      <td>nick</td>
      <td>15</td>
      <td>None</td>
      <td>None</td>
      <td>ABC</td>
    </tr>
    <tr>
      <th>2</th>
      <td>juli</td>
      <td>14</td>
      <td>None</td>
      <td>None</td>
      <td>ABC</td>
    </tr>
  </tbody>
</table>
</div>




```python
df[['Null_Column_2']] = df[['Null_Column_2']].fillna(value='ABC', axis='columns')
```


```python
df
```




<div>
<style scoped>
    .dataframe tbody tr th:only-of-type {
        vertical-align: middle;
    }

    .dataframe tbody tr th {
        vertical-align: top;
    }

    .dataframe thead th {
        text-align: right;
    }
</style>
<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>Name</th>
      <th>Age</th>
      <th>Null_Column</th>
      <th>Null_Column_2</th>
      <th>new_col</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>tom</td>
      <td>10</td>
      <td>None</td>
      <td>ABC</td>
      <td>ABC</td>
    </tr>
    <tr>
      <th>1</th>
      <td>nick</td>
      <td>15</td>
      <td>None</td>
      <td>ABC</td>
      <td>ABC</td>
    </tr>
    <tr>
      <th>2</th>
      <td>juli</td>
      <td>14</td>
      <td>None</td>
      <td>ABC</td>
      <td>ABC</td>
    </tr>
  </tbody>
</table>
</div>




```python
#select rows, where given column has a specified value
df.loc[df['Age'] == 15]
```




<div>
<style scoped>
    .dataframe tbody tr th:only-of-type {
        vertical-align: middle;
    }

    .dataframe tbody tr th {
        vertical-align: top;
    }

    .dataframe thead th {
        text-align: right;
    }
</style>
<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>Name</th>
      <th>Age</th>
      <th>Null_Column</th>
      <th>Null_Column_2</th>
      <th>new_col</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>1</th>
      <td>nick</td>
      <td>15</td>
      <td>None</td>
      <td>ABC</td>
      <td>ABC</td>
    </tr>
  </tbody>
</table>
</div>




```python
#select a given value, example imagine it is a matrix, and you want to select matrix[i][j]
df.loc[df['Age'] == 15, 'Null_Column_2']
```




    1    ABC
    Name: Null_Column_2, dtype: object




```python
df.loc[df['Age'] == 15, 'Null_Column_2'] = None
```


```python
df
```




<div>
<style scoped>
    .dataframe tbody tr th:only-of-type {
        vertical-align: middle;
    }

    .dataframe tbody tr th {
        vertical-align: top;
    }

    .dataframe thead th {
        text-align: right;
    }
</style>
<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>Name</th>
      <th>Age</th>
      <th>Null_Column</th>
      <th>Null_Column_2</th>
      <th>new_col</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>tom</td>
      <td>10</td>
      <td>None</td>
      <td>ABC</td>
      <td>ABC</td>
    </tr>
    <tr>
      <th>1</th>
      <td>nick</td>
      <td>15</td>
      <td>None</td>
      <td>None</td>
      <td>ABC</td>
    </tr>
    <tr>
      <th>2</th>
      <td>juli</td>
      <td>14</td>
      <td>None</td>
      <td>ABC</td>
      <td>ABC</td>
    </tr>
  </tbody>
</table>
</div>




```python
#replace non value for a given column by value="ABC2"
df[['Null_Column_2']] = df[['Null_Column_2']].fillna(value='ABC2', axis='columns')
```


```python
df
```




<div>
<style scoped>
    .dataframe tbody tr th:only-of-type {
        vertical-align: middle;
    }

    .dataframe tbody tr th {
        vertical-align: top;
    }

    .dataframe thead th {
        text-align: right;
    }
</style>
<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>Name</th>
      <th>Age</th>
      <th>Null_Column</th>
      <th>Null_Column_2</th>
      <th>new_col</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>tom</td>
      <td>10</td>
      <td>None</td>
      <td>ABC</td>
      <td>ABC</td>
    </tr>
    <tr>
      <th>1</th>
      <td>nick</td>
      <td>15</td>
      <td>None</td>
      <td>ABC2</td>
      <td>ABC</td>
    </tr>
    <tr>
      <th>2</th>
      <td>juli</td>
      <td>14</td>
      <td>None</td>
      <td>ABC</td>
      <td>ABC</td>
    </tr>
  </tbody>
</table>
</div>




```python

```
